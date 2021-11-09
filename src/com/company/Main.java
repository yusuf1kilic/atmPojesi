package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.
        Scanner input=new Scanner(System.in);
        String userName,password;
        int right=3;
        int balance = 1500;
        int select;


        while (right>0){
            System.out.print("lütfen bir kullanıcı adın giriniz : ");
            userName= input.nextLine();
            System.out.print("lütfen bir password giriniz : ");
            password= input.nextLine();

            if (userName.equals("yusuf")&&password.equals("123")){
                System.out.println("sisteme giriş yaptınız");
                do {
                    System.out.println("lütfen yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1) para yatırma \n"+"2) para çekme \n"+"3) bakiye sorgulama \n"+"4) çıkış yap");
                    select=input.nextInt();
                    switch (select) {
                        case 1 : {
                            System.out.println("para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                        }
                        break;
                        case 2 : {
                            System.out.println("para miktarı : ");
                            int price = input.nextInt();
                            if (price>balance){
                                System.out.println("bakiye yetersiz");
                            }else{
                                balance-=price;
                            }
                            break;



                        }
                        case 3:{
                            System.out.println("bakiyeniz :"+balance);
                        }
                        break;



                    }

                }while (select!=4);
                System.out.println("tekrar görüşmek üzere");
                break;
            }else{
                right--;
                System.out.println("hatalı giriş");
                if (right==0){
                    System.out.println("hesabınız bloke olmuştur");
                }
                System.out.println("kalan hakkınız : "+right);
            }

        }


    }
}
