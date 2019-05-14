public class Lion {


//    methods

    private String sex;
    private int age;
    private String name;
    private boolean hungry;

    //    Constructor
    public Lion(String sex, int age, String name, boolean hungry) {
        this.sex = sex;
        this.age = age;
        this.name = name;
        this.hungry = hungry;
    }



//    public Lion() {
//        this.sex = "Male";
//        this.age = 0;
//        this.name = "Jeff";
//        this.hungry = false;
//    }


    public String getSex() {
        return sex;
    }


    public void setsex(String sex) {
        if (sex.equals("Male") || sex.equals("female")) {
            System.out.println("Please use male or female to set sex");
        } else {
            this.sex = sex;
        }

    }

//    private void setsex(String sex) {
//        if(!sex.equals("Male") && !sex.equals("female")) {
//            System.out.println("Please use male or female to set sex");
//        } else {
//            this.sex = sex;
//        }
//
//    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean eat(String food) {
        if (food.equals("Ant")) {
            hungry = true;

        } else if (food.equals("antelope") && this.hungry == true) {
            hungry = false;

        }
        return hungry;
    }


    public void run(String speed) {
        System.out.println("The lion is running " + run);
    }

    public void roar() {
        System.out.println("ROAR");
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
}
