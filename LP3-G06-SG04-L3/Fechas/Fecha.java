/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }

    public void leerFecha() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el día (1-31): ");
        this.dia = scanner.nextInt();
        System.out.print("Ingrese el mes (1-12): ");
        this.mes = scanner.nextInt();
        System.out.print("Ingrese el año (1900-2050): ");
        this.anio = scanner.nextInt();
        valida();
    }

    private void valida() {
        if (anio < 1900 || anio > 2050) {
            anio = 1900;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        int maxDias = diasMes(mes);
        if (dia < 1 || dia > maxDias) {
            dia = 1;
        }
    }

    public void mostrarFecha() {
        System.out.printf("%02d-%02d-%04d\n", dia, mes, anio);
    }

    public boolean bisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public int diasMes(int mes) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && bisiesto()) {
            return 29;
        }
        return diasPorMes[mes];
    }

    public void corta() {
        System.out.printf("%02d-%02d-%04d\n", dia, mes, anio);
    }

    public int diasTranscurridos() {
        Calendar calendar = new GregorianCalendar(anio, mes - 1, dia);
        Calendar inicio = new GregorianCalendar(1900, 0, 1);
        long diferencia = calendar.getTimeInMillis() - inicio.getTimeInMillis();
        return (int) (diferencia / (1000 * 60 * 60 * 24));
    }

    public int diaSemana() {
        Calendar calendar = new GregorianCalendar(anio, mes - 1, dia);
        return calendar.get(Calendar.DAY_OF_WEEK) - 1; // 0 para domingo, ..., 6 para sábado
    }

    public void larga() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy");
        Date date = new GregorianCalendar(anio, mes - 1, dia).getTime();
        System.out.println(sdf.format(date));
    }

    public void fechaTras(long dias) {
        Calendar calendar = new GregorianCalendar(1900, 0, 1);
        calendar.add(Calendar.DAY_OF_YEAR, (int) dias);
        this.dia = calendar.get(Calendar.DAY_OF_MONTH);
        this.mes = calendar.get(Calendar.MONTH) + 1;
        this.anio = calendar.get(Calendar.YEAR);
    }

    public int diasEntre(Fecha otraFecha) {
        Calendar calendar1 = new GregorianCalendar(anio, mes - 1, dia);
        Calendar calendar2 = new GregorianCalendar(otraFecha.anio, otraFecha.mes - 1, otraFecha.dia);
        long diferencia = calendar1.getTimeInMillis() - calendar2.getTimeInMillis();
        return (int) (Math.abs(diferencia) / (1000 * 60 * 60 * 24));
    }

    public void siguiente() {
        Calendar calendar = new GregorianCalendar(anio, mes - 1, dia);
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        this.dia = calendar.get(Calendar.DAY_OF_MONTH);
        this.mes = calendar.get(Calendar.MONTH) + 1;
        this.anio = calendar.get(Calendar.YEAR);
    }

    public void anterior() {
        Calendar calendar = new GregorianCalendar(anio, mes - 1, dia);
        calendar.add(Calendar.DAY_OF_YEAR, -1);
        this.dia = calendar.get(Calendar.DAY_OF_MONTH);
        this.mes = calendar.get(Calendar.MONTH) + 1;
        this.anio = calendar.get(Calendar.YEAR);
    }

    public void fechaFutura(long dias) {
        Calendar calendar = new GregorianCalendar(anio, mes - 1, dia);
        calendar.add(Calendar.DAY_OF_YEAR, (int) dias);
        this.dia = calendar.get(Calendar.DAY_OF_MONTH);
        this.mes = calendar.get(Calendar.MONTH) + 1;
        this.anio = calendar.get(Calendar.YEAR);
    }

    public Fecha copia() {
        return new Fecha(this.dia, this.mes, this.anio);
    }

    public static boolean igualQue(Fecha fecha1, Fecha fecha2) {
        return fecha1.dia == fecha2.dia && fecha1.mes == fecha2.mes && fecha1.anio == fecha2.anio;
    }

    public static boolean menorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.anio < fecha2.anio) {
            return true;
        } else if (fecha1.anio == fecha2.anio && fecha1.mes < fecha2.mes) {
            return true;
        } else if (fecha1.anio == fecha2.anio && fecha1.mes == fecha2.mes && fecha1.dia < fecha2.dia) {
            return true;
        }
        return false;
    }

    public static boolean mayorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.anio > fecha2.anio) {
            return true;
        } else if (fecha1.anio == fecha2.anio && fecha1.mes > fecha2.mes) {
            return true;
        } else if (fecha1.anio == fecha2.anio && fecha1.mes == fecha2.mes && fecha1.dia > fecha2.dia) {
            return true;
        }
        return false;
    }
}
