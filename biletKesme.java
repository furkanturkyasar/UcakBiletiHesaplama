import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        double km,age,type,totalPrice,ageDiscount,typeDiscount;

        System.out.print("Lutfen mesafeyi giriniz: ");
        km=inp.nextDouble();

        System.out.print("Lutfen yasinizi giriniz: ");
        age=inp.nextDouble();

        System.out.print("Lutfen tek yon(1) mu gidis-gelis(2) mi yaziniz: ");
        type=inp.nextDouble();

        totalPrice=(km*0.10);


        if (km>0&&age>0&&type>0&&type<3){
            if (age>=12&&age<=24){
                ageDiscount=(totalPrice * 0.10);
                totalPrice= (totalPrice-ageDiscount);
                if (type==2){
                    typeDiscount=(totalPrice*0.20);
                    totalPrice= (totalPrice-typeDiscount)*2;
                    System.out.print("Indirimli fiyat: "+totalPrice);

                }else if (type==1){

                    System.out.println("Indirimli fiyat: "+totalPrice);
                }

            }else if (age<12){
                ageDiscount=(totalPrice * 0.50);
                totalPrice= (totalPrice-ageDiscount);
                if (type==2){
                    typeDiscount=(totalPrice*0.20);
                    totalPrice= (totalPrice-typeDiscount)*2;
                    System.out.print("Indirimli fiyat: "+totalPrice);

                }else if (type==1){
                    System.out.println("Indirimli fiyat: "+totalPrice);
                }


            }else if (age>65){
                ageDiscount=(totalPrice * 0.30);
                totalPrice= (totalPrice-ageDiscount);
                if (type==2){
                    typeDiscount=(totalPrice*0.20);
                    totalPrice= (totalPrice-typeDiscount)*2;
                    System.out.print("Indirimli fiyat: "+totalPrice);

                }else if (type==1){
                    System.out.println("Indirimli fiyat: "+totalPrice);
                }

            }else if (age<65){
                if (type==2){
                    typeDiscount=(totalPrice*0.20);
                    totalPrice= (totalPrice-typeDiscount)*2;
                    System.out.print("Indirimli fiyat: "+totalPrice);

                }else if (type==1){
                    System.out.println("Indirimli fiyat: "+totalPrice);
                }
            }
        }else {
            System.out.print("Yanlis veri girdiniz! ");
        }







    }

}
