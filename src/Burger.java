 public class Burger {
    public String bun;
    public String meat;
    public String cheese;
    public String greenery;
    public String mayonnaise;

    // для первого бургера


     public Burger(String bun, String meat, String cheese, String greenery, String mayonnaise) {
         this.bun = bun;
         this.meat = meat;
         this.cheese = cheese;
         this.greenery = greenery;
         this.mayonnaise = mayonnaise;
         System.out.println("Сomposition of a regular burger: " + this.bun + " + " + this.meat + " + " + this.cheese + " + " + this.greenery + " + " + this.mayonnaise);
     }

     public Burger(String bun, String meat, String cheese, String greenery) {
         this.bun = bun;
         this.meat = meat;
         this.cheese = cheese;
         this.greenery = greenery;
     System.out.println("Сomposition of a diet burger: " + this.bun + " + " + this.meat + " + " + this.cheese + " + " + this.greenery);
    }
    // з подвійним м'ясом
    public Burger(String bun, String meat, String cheese, String greenery, String mayonnaise, int countmeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;

        if (countmeat == 2){
            System.out.println("Сomposition of a burger with addmeat: " + this.bun + " + " + this.meat + " + "  + this.cheese + " + " + this.greenery + " + " + this.mayonnaise);

        }else {
            System.out.println(" Error burger with addmeat have to contain 2 pieces of meat ");


        }



     }
 }
















//з подвійним м'ясом





