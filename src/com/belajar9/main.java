// OPERATOR LOGIKA
// operator logika adalah operator yang melibatkan nilai nilai boolean dalam operasinya
// operator ini terdiri dari AND, OR, XOR dan Negasi
package com.belajar9;

public class main {
    public static void main(String[] args){

        System.out.println("===============");
        System.out.println("OPERATOR LOGIKA");
        System.out.println("===============");

        // deklarasi
        boolean a,b,hasil;

        // jenis-jenis operator logika:

        // 1. OR (||)
        // untuk mengahasilkan nilai true diperlukan hanya satu nilai true
        System.out.println("\n1. OPERATOR LOGIKA OR (||)");
        System.out.println("-------------------------------------------------------------------");
        a = false;
        b = false;
        hasil = false;
        System.out.println( a + " || " + b + " = " + hasil);
        a = true;
        b = false;
        hasil = a || b;
        System.out.println( a + " || " + b + " = " + hasil);
        a = true;
        b = true;
        hasil = a || b;
        System.out.println( a + " || " + b + " = " + hasil);

        // 2. AND (&&)
        // untuk mengahasilkan nilai true diperlukan dua nilai true
        System.out.println("\n2. OPERATOR LOGIKA AND (&&)");
        System.out.println("-------------------------------------------------------------------");
        a = false;
        b = false;
        hasil = a && b;
        System.out.println( a + " && " + b + " = " + hasil);
        a = true;
        b = false;
        hasil = a && b;
        System.out.println( a + " && " + b + " = " + hasil);
        a = true;
        b = true;
        hasil = a && b;
        System.out.println( a + " && " + b + " = " + hasil);

        // 3. XOR (^)
        // untuk mengahasilkan nilai true diperlukan dua nilai true dan nilai false
        System.out.println("\n3. OPERATOR LOGIKA XOR (^)");
        System.out.println("-------------------------------------------------------------------");
        a = false;
        b = false;
        hasil = a ^ b;
        System.out.println( a + " ^ " + b + " = " + hasil);
        a = true;
        b = false;
        hasil = a ^ b;
        System.out.println( a + " ^ " + b + " = " + hasil);
        a = true;
        b = true;
        hasil = a ^ b;
        System.out.println( a + " ^ " + b + " = " + hasil);

        // 4. NEGASI (!)
        // untuk membalikkan nilai menuju lawan dari nilai tersebut
        System.out.println("\n4. OPERATOR LOGIKA NEGASI (!)");
        System.out.println("-------------------------------------------------------------------");
        a = false;
        hasil = !a;
        System.out.println( "! " + a + " = " + hasil);
        a = true;
        hasil = !a;
        System.out.println( "! " + a + " = " + hasil);
    }
}
