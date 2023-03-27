package org.example.hw1.model;

import java.util.*;

public class Base {


    private Set<Laptop> laptopSet = new HashSet<>();



    private List<Criteries> lS = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    public void printSet() {
        for (Laptop laptops : laptopSet) {
            if (lapOut(laptops)) {
                System.out.println(laptops);
            }
        }
    }

    public boolean lapOut(Laptop laptop) {

        for (Criteries lap : lS) {
            Object lapValue = null;

            if (lap.property.equals("id")) {
                lapValue = laptop.getId();
            } else if (lap.property.equals("name")) {
                lapValue = laptop.getName();
            } else if (lap.property.equals("ram")) {
                lapValue = laptop.getRam();
            } else if (lap.property.equals("om")) {
                lapValue = laptop.getOm();
            } else if (lap.property.equals("os")) {
                lapValue = laptop.getOs();
            } else if (lap.property.equals("color")) {
                lapValue = laptop.getColor();
            } else {
                continue;
            }

            if (lap.value != null && !lap.value.equals(lapValue)) {
                return false;
            }

            if (lap.maxValue != null && lap.maxValue < Double.parseDouble(Objects.toString(lapValue))) {
                return false;
            }

            if (lap.minValue != null && lap.minValue > Double.parseDouble(Objects.toString(lapValue))) {
                return false;
            }
        }

        return true;
    }

    public Base(Set<Laptop> laptopSet) {
        this.scanner = new Scanner(System.in);
        this.lS = lS;
    }

    public Base(Set<Laptop> laptopSet, List<Criteries> lS) {
        this.scanner = new Scanner(System.in);
        this.lS = lS;
        this.laptopSet = laptopSet;
    }

    public int getCriteria() {
        String text = "Введите цифру, соответствующую необходимому критерию: ";

        List<String> properties = propertiesForFilter();

        for (int i = 0; i < properties.size(); i++) {
            text += "\n" + (i + 1) + ". " + getPropertyDescription(properties.get(i));
        }

        System.out.println(text);

        int value = scanner.nextInt();

        return value;
    }

    public String getPropertyDescription(String property) {

        Map<String, String> descriptionsProperties = descriptionsProperties();

        return descriptionsProperties.get(property);

    }

    public Map<String, String> descriptionsProperties() {
        Map<String, String> map = new HashMap<>();

        map.put("id", "Номер товара");
        map.put("name", "Наименование");
        map.put("ram", "Жесткий диск");
        map.put("om", "ОЗУ");
        map.put("os", "Оперативная система");
        map.put("color", "Цвет");

        return map;

    }

    public List<String> propertiesForFilter() {
        List<String> list = new ArrayList<>();
        list.add("id");
        list.add("name");
        list.add("ram");
        list.add("om");
        list.add("os");
        list.add("color");

        return list;
    }

    public String getOperations() {

        String text = "Выберите опрерацию: \n " +
                "1. Добавить критерий \n " +
                "2. Вывести список \n " +
                "3. Завершить";

        System.out.println(text);

        String num = scanner.next();

        return num;
    }

    public Set<String> quantitativeSelection() {
        Set<String> set = new HashSet<>();
        set.add("id");
        set.add("ram");
        set.add("om");

        return set;
    }

    public Set<String> stringSelection() {
        Set<String> set = new HashSet<>();

        set.add("name");
        set.add("operatingSystem");
        set.add("model");

        return set;
    }

    public void start(){

        boolean flag = true;
        while (flag){

            String operation = getOperations();
            if (operation.equals("3")){
                flag = false;
                scanner.close();
                continue;
            }else if(operation.equals("1")){

                int criterion = getCriteria();
                List<String> properties = propertiesForFilter();
                if (criterion - 1 < 0 || criterion - 1 > properties.size() - 1){
                    System.out.println("Введено некорректное значение");
                    continue;
                }
                String property = properties.get(criterion - 1);
                Criteries criterionObject = null;
                try {
                    if (quantitativeSelection().contains(property)){
                        criterionObject = Criteries.startGetting(scanner, property, true);
                    }else {
                        criterionObject = Criteries.startGetting(scanner, property, false);
                    }
                }catch (Exception e){
                    System.out.println("Ошибка при выборе критерия");
                    continue;
                }
                if (criterionObject != null){
                    System.out.println("Критерий добавлен");
                    lS.add(criterionObject);
                }
            }
            else if (operation.equals("2")){
                printSet();
            }
        }
    }
}
    class Criteries {

        Object value;
        Double minValue;
        Double maxValue;
        boolean isQuantitative;
        String property;

        public Criteries(String property, boolean isQuantitative, Object value, Double minValue, Double maxValue) {
            this.property = property;
            this.isQuantitative = isQuantitative;
            this.value = value;
            this.minValue = minValue;
            this.maxValue = maxValue;
        }

        public static Criteries startGetting(Scanner scanner, String property, boolean isQuantitative) {

            if (isQuantitative) {

                String board = "Выберите тип криетрия: " +
                        "\n 1. Значение" +
                        "\n 2. Меньше" +
                        "\n 3. Больше" +
                        "\n 4. Интервал";
                System.out.println(board);

                String num2 = scanner.next();

                Criteries critery = null;
                if (num2.equals("1")) {
                    System.out.println("Введите значение поиска: ");
                    int getValue = scanner.nextInt();
                    critery = new Criteries(property, isQuantitative, getValue, null, null);
                } else if (num2.equals("2")) {
                    System.out.println("Введите максимальное предельное значение: ");
                    double getValue = scanner.nextDouble();
                    critery = new Criteries(property, isQuantitative, null, null, getValue);
                } else if (num2.equals("3")) {
                    System.out.println("Введите минимальное предельное значение: ");
                    double getValue = scanner.nextDouble();
                    critery = new Criteries(property, isQuantitative, null, getValue, null);
                } else if (num2.equals("4")) {
                    System.out.println("Введите минимальное предельное значение: ");
                    double getMin = scanner.nextDouble();
                    System.out.println("Введите максимальное предельное значение: ");
                    double getMax = scanner.nextDouble();
                    critery = new Criteries(property, isQuantitative, null, getMin, getMax);
                }

                return critery;
            }

            System.out.println("Введите значение поиска: ");
            String getValue = scanner.next();
            return new Criteries(property, isQuantitative, getValue, null, null);
        }
    }


