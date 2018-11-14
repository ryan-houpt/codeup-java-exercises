public class RestaurantTest {

    public static void main(String[] args) {

        ResraurantDish Dish = new ResraurantDish();

        Dish.costInCents = 500;
        Dish.nameOfDish = "Chili";
        Dish.woouldRecommend = true;

        System.out.println(Dish.costInCents);
        System.out.println(Dish.nameOfDish);
        System.out.println(Dish.woouldRecommend);

        Dish.eat();

    }

}
