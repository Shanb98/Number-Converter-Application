import java.util.*;
class Number_Converter{
    public static void main(String args[]){
        FrontPage();
    }


    public static void FrontPage(){
        System.out.println("              _   _____            _                ");
        System.out.println("             |$$ /      \\         | \\                 ");
        System.out.println("              \\ | $$$$$$$  ______ |$$  _______          " );
        System.out.println("            | $$| $$  \\$$|/      \\|$$/        \\         " );
        System.out.println("            | $$| $$      \\$$$$$$$|$$|  $$$$$$$          " );
        System.out.println("            | $$| $$  __  /     $$|$$| $$                 " );
        System.out.println("            | $$| $$_/  \\|$$$$$$$$|$$| $$____              " );
        System.out.println("            | $$| $$   $$\\$$    $$|$$\\ $$    \\             ");
        System.out.println("             \\$$ \\$$$$$$  \\$$$$$$$\\$$ \\$$$$$$$              ");
        System.out.println(" _    _                   _                  ______                                        _ ");
        System.out.println("| \\ | |                  | |                / _____|                                      | |       ");
        System.out.println("|  \\| | _    _  __.__    | |__   __  _.__  | /          __    _.__ __     __ ____   _.___ | |__  ___   _ ___");
        System.out.println("| .   || |  | || _ . _ \\ |  _ \\/ _ \\|  __| | |        / _ \\  |  _  \\ \\  /  //  __\\ |  ___||  __|/ __\\ | .___|");
        System.out.println("| |\\  || |__| || || | | || |_| | __/| |    \\ \\_____  | |_| | | | |  \\ \\/  /|   __/ | |    | |__|  __/ | |");
        System.out.println("|_| \\_| \\._._ ||_||_| |_||_.__/\\___||_|     \\______|  \\___/  |_| |_| \\___/  \\____| |_|     \\__| \\___| |_|       ");
        System.out.println("============================================================================================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("    [01] Decimal Converter \n");
        System.out.println("    [02] Binary Converter \n");
        System.out.println("    [03] Octal Converter \n");
        System.out.println("    [04] Hexadicimal Converter \n");
        System.out.println("    [05] Roman Number Converter \n");

        Scanner input=new Scanner(System.in);
        System.out.print("Enter Option  -> ");
        int Option=input.nextInt();
        System.out.println("");
        System.out.println("");
        if(Option==1){
            DecimalConverter(Option);
        }
        else if (Option==2){
            BinaryConverter(Option);
        }
        else if (Option==3){
            OctalConverter(Option);
        }
        else if(Option==4){
            HexaDecimalConverter(Option);
        }
        else if(Option==5){
            RomanConverter(Option);
        }

    }
    public static void DecimalConverter(int Option){
        Scanner input=new Scanner(System.in);
        System.out.println("+-------------------------------------------+");
        System.out.println("|             Decimal Converter             |");
        System.out.println("+-------------------------------------------+");
        System.out.println("");
        System.out.print("Enter an Decimal number : ");
        int num=input.nextInt();
        if(num>=0 && num<=1000){
            System.out.println(" ");
            DecimaltoBinary(num);
            DecimaltoOctal(num);
            DecimaltoHexadecimal(num);
            System.out.println("");

            System.out.print("Do you want to go to homepage (Y/N)  -> ");
            char hp=input.next().charAt(0);
            if(hp == 'Y'){
                FrontPage();
            }
            else if(hp=='N'){
                DecimalConverter(Option);
            }

        }
        else{
            System.out.println("        Invalid Input...");
            System.out.println("");
            System.out.print("Do you want to input number again (Y/N)  -> ");
            char YorN=input.next().charAt(0);
            System.out.println("");
            System.out.println("");

            if(YorN == 'Y'){
                DecimalConverter(Option);

            }
            else if(YorN == 'N' ){
                FrontPage();

            }

        }

    }

    public static void BinaryConverter(int Option){
        Scanner input=new Scanner(System.in);
        System.out.println("+-------------------------------------------+");
        System.out.println("|              Binary Converter             |");
        System.out.println("+-------------------------------------------+");
        System.out.println("");
        System.out.print("Enter an Binary number : ");
        int num=input.nextInt();

        if(num>=0){
            BinarytoDecimal(num);
            BinarytoOctal(num);
            BinarytoHexadecimal(num);
            System.out.println("");

            System.out.print("Do you want to go to homepage (Y/N)  -> ");
            char hp=input.next().charAt(0);
            if(hp == 'Y'){
                FrontPage();
            }
            else if(hp=='N'){
                BinaryConverter(Option);
            }
        }
        else{
            System.out.println("        Invalid Input...");
            System.out.println("");
            System.out.print("Do you want to input number again (Y/N)  -> ");
            char YorN=input.next().charAt(0);
            System.out.println("");
            System.out.println("");

            if(YorN == 'Y'){
                BinaryConverter(Option);

            }
            else if(YorN == 'N' ){
                FrontPage();

            }

        }

    }

    public static void OctalConverter(int Option){
        Scanner input=new Scanner(System.in);
        System.out.println("+-------------------------------------------+");
        System.out.println("|              Octal Converter              |");
        System.out.println("+-------------------------------------------+");
        System.out.println("");
        System.out.print("Enter an Octal number : ");
        int num=input.nextInt();
        if(num>=0){
            OctaltoDecimal(num);
            System.out.println("");

            System.out.print("Do you want to go to homepage (Y/N)  -> ");
            char hp=input.next().charAt(0);
            if(hp == 'Y'){
                FrontPage();
            }
            else if(hp=='N'){
                OctalConverter(Option);
            }
        }
        else{
            System.out.println("        Invalid Input...");
            System.out.println("");
            System.out.print("Do you want to input number again (Y/N)  -> ");
            char YorN=input.next().charAt(0);
            System.out.println("");
            System.out.println("");

            if(YorN == 'Y'){
                OctalConverter(Option);

            }
            else if(YorN == 'N' ){
                FrontPage();

            }

        }
    }

    public static void HexaDecimalConverter(int Option){
        Scanner input=new Scanner(System.in);
        System.out.println("+-------------------------------------------+");
        System.out.println("|           HexaDecimal Converter           |");
        System.out.println("+-------------------------------------------+");
        System.out.println("");
        System.out.print("Enter an Decimal number : ");
        String hexnum = input.nextLine();
        HexaDecimaltoOthers(hexnum);
        System.out.println("");
        System.out.println("");
        System.out.print("Do you want to go to homepage (Y/N)  -> ");
        char hp=input.next().charAt(0);
        if(hp == 'Y'){
            FrontPage();
        }
        else if(hp=='N'){
            OctalConverter(Option);
        }
    }
    public static void DecimaltoBinary(int num){
        int rev=0;
        int x=1;
        while (num > 0) {
            int digit = num % 2;
            rev=rev+digit * x;
            num /= 2;
            x*=10;
        }
        System.out.println("        Binery Number        : "+rev);

    }

    public static void DecimaltoOctal(int num){

        int rev=0;
        int x=1;
        while (num > 0) {
            int digit = num % 8;
            rev=rev+digit * x;
            num /= 8;
            x*=10;
        }
        System.out.println("        Octal Number         : "+rev);

    }
    public static void DecimaltoHexadecimal(int num){

        int rev=0;
        int x=1;
        while (num > 0) {
            int digit = num % 16;
            rev=rev+digit * x;
            num /= 16;
            x*=10;
        }
        System.out.println("        Hexadecimal number   : "+ rev);

    }

    public static void BinarytoDecimal(int num){
        int rev=0;
        double p = 0;
        double x=0;
        while (num > 0) {
            rev=num%10;
            x=x+rev*Math.pow(2, p);
            p++;
            num=num/10;

        }
        System.out.println("");
        System.out.println("        Decimal Number       : "+(int)x );

    }

    public static void BinarytoOctal(int num){
        int rev=0;
        double p = 0;
        double x=0;
        while (num > 0) {
            rev=num%10;
            x=x+rev*Math.pow(2, p);
            p++;
            num=num/10;

        }

        DecimaltoOctal((int)x);

    }
    public static void BinarytoHexadecimal(int num){
        int rev=0;
        double p = 0;
        double x=0;
        while (num > 0) {
            rev=num%10;
            x=x+rev*Math.pow(2, p);
            p++;
            num=num/10;

        }
        int dec = (int)x;
        System.out.println("        Hexadecimal number   : "+Integer.toHexString(dec));


    }
    public static void OctaltoDecimal(int num){
        int rev=0;
        double p = 0;
        double x=0;
        while (num > 0) {
            rev=num%10;
            x=x+rev*Math.pow(8, p);
            p++;
            num=num/10;

        }
        System.out.println("        Decimal Number       : "+(int)x );
        System.out.println("        Binary Number        : "+Integer.toBinaryString((int)x));
        System.out.println("        Hexadecimal number   : "+Integer.toHexString((int)x));
    }

    public static void HexaDecimaltoOthers(String hexnum){
        int decimal = Integer.parseInt(hexnum, 16);
        String binary = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        String hex = Integer.toHexString(decimal);


        System.out.println("        Decimal Number       : " + decimal);
        System.out.println("        Binary Number        : " + binary);
        System.out.println("        Octal Number         : " + octal);
    }

    public static void RomanConverter(int Option){
        Scanner input=new Scanner(System.in);
        System.out.println("+--------------------------------------------------+");
        System.out.println("|              Roman Number Converter              |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("");
        System.out.println("    [01] Decimal Number to Roman Number Converter \n");
        System.out.println("    [02] Roman Number to Decimal Number Converter \n");
        System.out.print("Enter an Option : ");
        int num1=input.nextInt();
        if(num1 == 1){
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("|        Decimal Number to Roman Number Converter              |");
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("");


            System.out.print("Enter a decimal number: ");
            int decimal = input.nextInt();

            String roman = "";
            while (decimal > 0) {
                if (decimal >= 1000) {
                    roman += "M";
                    decimal -= 1000;
                } else if (decimal >= 900) {
                    roman += "CM";
                    decimal -= 900;
                } else if (decimal >= 500) {
                    roman += "D";
                    decimal -= 500;
                } else if (decimal >= 400) {
                    roman += "CD";
                    decimal -= 400;
                } else if (decimal >= 100) {
                    roman += "C";
                    decimal -= 100;
                } else if (decimal >= 90) {
                    roman += "XC";
                    decimal -= 90;
                } else if (decimal >= 50) {
                    roman += "L";
                    decimal -= 50;
                } else if (decimal >= 40) {
                    roman += "XL";
                    decimal -= 40;
                } else if (decimal >= 10) {
                    roman += "X";
                    decimal -= 10;
                } else if (decimal >= 9) {
                    roman += "IX";
                    decimal -= 9;
                } else if (decimal >= 5) {
                    roman += "V";
                    decimal -= 5;
                } else if (decimal >= 4) {
                    roman += "IV";
                    decimal -= 4;
                } else {
                    roman += "I";
                    decimal -= 1;
                }
            }

            System.out.println("\n       Roman numeral  : " + roman);
            System.out.println("");
            System.out.println("");
            System.out.print("Do you want to go to homepage (Y/N)  -> ");
            char hp=input.next().charAt(0);
            if(hp == 'Y'){
                FrontPage();
            }
            else if(hp=='N'){
                RomanConverter(Option);
            }

        }
        else if(num1 == 2){
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("|        Roman Number to Decimal Number Converter              |");
            System.out.println("+--------------------------------------------------------------+");
            System.out.println("");
            RomantoDecimal(num1);



        }
        else{
            System.out.println("Enter a Valid Option : ");
        }

    }
    public static void RomantoDecimal(int num1){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = input.nextLine();

        int decimal = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char symbol = roman.charAt(i);
            int value;
            switch (symbol) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default:
                    value = 0;
            }

            if (value < prevValue) {
                decimal -= value;
            } else {
                decimal += value;
            }

            prevValue = value;
        }

        System.out.println("      Decimal number: " + decimal);

        System.out.println("");
        System.out.println("");
        System.out.print("Do you want to go to homepage (Y/N)  -> ");
        char hp=input.next().charAt(0);
        if(hp == 'Y'){
            FrontPage();
        }
        else if(hp=='N'){

        }
    }

}



