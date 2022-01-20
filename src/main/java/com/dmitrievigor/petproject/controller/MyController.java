package com.dmitrievigor.petproject.controller;

import com.dmitrievigor.petproject.entity.drink.Drink;
import com.dmitrievigor.petproject.entity.drink.TypesDrinks;
import com.dmitrievigor.petproject.entity.drink.coffee.Cappuccino;
import com.dmitrievigor.petproject.entity.drink.coffee.CoffeeWithMilk;
import com.dmitrievigor.petproject.entity.drink.coffee.Espresso;
import com.dmitrievigor.petproject.entity.drink.coffee.Latte;
import com.dmitrievigor.petproject.entity.drink.tea.ColdTea;
import com.dmitrievigor.petproject.entity.drink.tea.HotTea;
import com.dmitrievigor.petproject.entity.drink.toppings.Cream;
import com.dmitrievigor.petproject.entity.drink.toppings.Lemon;
import com.dmitrievigor.petproject.entity.drink.toppings.Syrup;
import com.dmitrievigor.petproject.entity.pizza.*;
import com.dmitrievigor.petproject.entity.pizza.toppings.DoubleCheese;
import com.dmitrievigor.petproject.entity.pizza.toppings.DoubleMashrooms;
import com.dmitrievigor.petproject.entity.pizza.toppings.DoubleTomatoPaste;
import com.dmitrievigor.petproject.service.DrinkService;
import com.dmitrievigor.petproject.service.PizzaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {
    @Autowired
   private PizzaService pizzaService;
    @Autowired
    private DrinkService drinkService;
    Pizza pizza;
    Drink drink;
    List<Pizza>allPizzas= new ArrayList<>();
    List<Drink>allDrinks= new ArrayList<>();

    List<Pizza>checkPizzas= new ArrayList<>();
    List<Drink>checkDrinks= new ArrayList<>();

    List<Pizza>checkPizzas2= new ArrayList<>();
    List<Drink>checkDrinks2= new ArrayList<>();

    double sum;
    double sum2;

    @RequestMapping("start")
    public String pizzaOrDrinks(){
      return "/pizza-or-drinks";
    }

    @RequestMapping("choice-pizza")
    public String addNewPizza(Model model){
        List<TypesPizzas>Pizzas =pizzaService.getAllPizzas() ;
        model.addAttribute("allPizzas",Pizzas);
        return "choice-pizza";
    }

    @RequestMapping("choice-drink")
    public String addNewDrink(Model model){
        List<TypesDrinks>Drinks =drinkService.getAllDrinks() ;
        model.addAttribute("allDrinks",Drinks);
        return "choice-drink";
    }



    @RequestMapping("sizePizza")
    public String sizePizza(@RequestParam("pizzaId")int id,Model model){
     if(id == 1){
         pizza = new Pepperoni();
     }
     else if(id==2){
         pizza = new PizzaFourCheese();
     }
     else if(id==3){
         pizza = new PizzaWithMashrooms();
     }
     else if(id==4){
         pizza = new HomemadePizza();
     }
     else if(id==5){
         pizza = new Carbonara();
     }
        model.addAttribute("pizza",pizza);
        return "select-size-pizza";
    }

    @RequestMapping("sizeDrink")
    public String sizeDrinks(@RequestParam("drinkId")int id,Model model){
        if(id == 1){
            drink= new HotTea();
        }
        else if(id==2){
            drink= new ColdTea();
        }
        else if(id==3){
            drink= new Cappuccino();
        }
        else if(id==4){
            drink= new CoffeeWithMilk();
        }
        else if(id==5){
            drink= new Espresso();
        }
        else if (id==6){
            drink= new Latte();
        }
        model.addAttribute("drink",drink);
        return "select-size-drink";
    }

    @RequestMapping("selectToppingsPizza")
    public String selectToppings(@ModelAttribute ("pizza")Pizza pizza2, Model model){
       pizza.setSize(pizza2.getSize());
      model.addAttribute("pizza",pizza);
        return "toppings-info-pizza";
    }
    @RequestMapping("selectToppingsDrinks")
    public String selectToppingsDrinks(@ModelAttribute ("drink")Drink drink2, Model model){
       drink.setSize(drink2.getSize());
        model.addAttribute("drink",drink);
        return "toppings-info-drinks";
    }

    @RequestMapping("garbage")
    public String inGarbage(@ModelAttribute ("pizza")Pizza pizza2,@ModelAttribute ("drink")Drink drink2,Model model){


        if(pizza2!=null){
         if(pizza2.isCheese()){
           pizza = new DoubleCheese(pizza);
         }
          if(pizza2.isMashrooms()){
             pizza = new DoubleMashrooms(pizza);
         }
          if(pizza2.isTomato()) {
              pizza = new DoubleTomatoPaste(pizza);
          }
          if(pizza!=null){
              sum = sum + pizza.getCost();
              allPizzas.add(pizza);
              checkPizzas.add(pizza);

         }}



        if(drink2!=null){
          if(drink2.isSyrup()){
              drink = new Syrup(drink);
          }
        if(drink2.isLemon()){
            drink = new Lemon(drink);
        }
        if(drink2.isCream()){
            drink = new Cream(drink);

        }
        if(drink!=null){
            sum = sum + drink.getCost();
            allDrinks.add(drink);
            checkDrinks.add(drink);
            model.addAttribute("allDrinks",allDrinks);
        }}





        model.addAttribute("allDrinks",allDrinks);
        model.addAttribute("allPizzas",allPizzas);
        model.addAttribute("allCost",sum);

        pizza = null;
        drink = null;

        return "garbage-info";
    }
    @RequestMapping("payment")
    public String payment(Model model){
        model.addAttribute("allCost",sum);
      return "payment-info";
    }
    @RequestMapping("theEnd")
    public String end(Model model){

        sum2=sum;
        checkDrinks2 =checkDrinks;
        checkPizzas2 = checkPizzas;
        allPizzas=new ArrayList<>();
        allDrinks=new ArrayList<>();
        sum =0;
        checkPizzas=new ArrayList<>();
        checkDrinks=new ArrayList<>();
        return "end";
    }
    @RequestMapping("check")
    public String check(Model model){
        model.addAttribute("checkPizzas", checkPizzas2);
        model.addAttribute("checkDrinks", checkDrinks2);
        model.addAttribute("allCost", sum2);
        return "check-info";

    }

}
