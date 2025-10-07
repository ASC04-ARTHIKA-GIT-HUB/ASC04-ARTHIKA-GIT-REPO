package com.demo.funda;

public class datatypes {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
            //list of primitive datatypes
            System.out.println("byte");
            System.out.println("short");
            System.out.println("int");
            System.out.println("long");
            System.out.println("float");
            System.out.println("double");
            System.out.println("char");
            System.out.println("boolean");

            //print the size of the memory occupied by each data type
            System.out.print("\nSize of the primitive Data Types:");
            System.out.println("byte: "+ Byte.BYTES + " bytes");
            System.out.println("short: " + Short.BYTES + " bytes");
            System.out.println("int: " + Integer.BYTES + " bytes");
            System.out.println("long: " + Long.BYTES + " bytes");
            System.out.println("float: " + Float.BYTES + " bytes");
            System.out.println("double: " + Double.BYTES + " bytes");
            System.out.println("char: " + Character.BYTES + " bytes");

            //assign default values
            byte b=0;
            short s=0;
            int i=0;
            long l=0;
            float  f=0.0f;
            double d=0.0d;

            // \u0000---.unicode rep of for null for chara
            char c='\u0000';
            boolean bool= false;
            System.out.println("\nDefault values:");
            System.out.println("byte: "+b);
            System.out.println("short: "+s);
            System.out.println("int: "+i);
            System.out.println("long: "+l);
            System.out.println("float: "+f);
            System.out.println("double: "+d);
            System.out.println("char: "+c);
            System.out.println("boolean: "+b);

            //assign the max and min values to the datatypes
            System.out.println("\nMax and Min Values:");
            System.out.println("byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
            System.out.println("short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
            System.out.println("int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
            System.out.println("long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
            System.out.println("float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
            System.out.println("double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
            System.out.println("char: " + (int) Character.MIN_VALUE + " to " + (int)Character.MAX_VALUE);
            System.out.println("boolean: " + "false and true");

        }
    }


