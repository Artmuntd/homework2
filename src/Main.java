public class Main {
    public static void main(String[] args) {
        // дз 1
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper =  763789;
        System.out.println(paper);
        // дз 2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        // дз 3
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        System.out.println(dog1);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // дз 4
        var friend = 19;
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //дз 5
        var frog = 3.5;
        frog = 3.5 * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //дз 6
        var firstWeightBoxer = 78.2;
        var secondWeightBoxer = 82.7;
        var totalWeight = firstWeightBoxer + secondWeightBoxer;
        System.out.println(totalWeight);
        var totalDifference = secondWeightBoxer - firstWeightBoxer;
        System.out.println(totalDifference);

        //дз 7
        var weightPercentage = secondWeightBoxer % firstWeightBoxer;
        System.out.println(weightPercentage);

        // дз 8
        var totalWorkingHours = 640;
        var totalPerDay = 8;
        var totalEmployees = totalWorkingHours/totalPerDay;
        System.out.println("всего работников в компани -"  + totalEmployees + "человек");
        totalEmployees = totalEmployees +94;
        totalWorkingHours =  totalEmployees * totalPerDay;
        System.out.println( "Если в компании работает"+ totalEmployees + "человек, то всего" + totalWorkingHours + "часов" );


    }
}