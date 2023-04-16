public class Main {

    public static void main(String[] args) {

        Person manuelo= new Person("Manuelo", "DJOMO",  17);
        Person Andreas= new Person("Andreas", "MOUZONG", 18);
        Person Claude= new Person("Claude", "NJOUME", 19);
        Person Aladji= new Person("Aladji", "Aladjhi", 20);

        System.out.println(" mes informations sont les suivantes:");
        System.out.println("prenom: "+manuelo .prenom);
        System.out.println("nom:" + manuelo.nom);
        System.out.println("age:" +manuelo.age);

        // produit
        int a=6;
        int b=3;
        int produit = a*b;
        int quotient = a/b;
        int reste= a%b;
        //int increment= ++a;
        //int decrement= --b;


        System.out.println( a + "*" + b + "=" + produit);
        System.out.println( a + "/" + b + "=" + quotient);
        System.out.println( a + " modulo " + b + "=" + reste);
        System.out.println(  " increment de 6 = " + ++a);
        System.out.println(  " increment de 3 = " +  --b);







    }
}
