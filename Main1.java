package com.company;

public class Main1 {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop(1600, 25, "Lenovo");
        Screen obj2 = new Screen(40, 30, 23);
        Keyboard obj3 = new Keyboard(35, 15, 80);
        Mouse obj4 = new Mouse(5, 160, "Logitech");
        System.out.println("Розмір екрану : " + obj1.screen + " Розмір клавіатури: " + obj1.keyboard + " Бренд: " + obj1.brand);
        System.out.println("Ширина екрану: " + obj2.width + " Довжина екрану: " + obj2.height + " Діаметр екрану: " + obj2.diameter);
        System.out.println("Ширина клавіатури: " + obj3.width + " Довжина клавіатури: " + obj3.height + " Кількість кнопок: " + obj3.buttons);
        System.out.println("Висота мишки: " + obj4.height + " Вага мишки в гр.: " + obj4.weight + " Бренд: " + obj4.brand);
    }
}