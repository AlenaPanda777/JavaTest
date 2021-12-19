package HomeWork5;

public class Worker {
    String nameSurnameSecondname;
    String position;
    String email;
    long phoneNumber;
    int salary;
    int age;

    public Worker(String nameSurnameSecondname, String position, String email, long phoneNumber, int salary, int age) {
        this.nameSurnameSecondname = nameSurnameSecondname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

        infoWorker();
        over40();




    }


     void infoWorker() {
        System.out.println("Фамилия Имя Отчество: " + nameSurnameSecondname + "; Должность: " + position + "; " +
                "Электронная почта: " + email + "; Номер телефона: " + phoneNumber + "; Заработная плата: " +
                salary + "; Возраст сотрудника: " + age);
    }



    void over40() {
        while (age > 40){
            System.out.println("Сотрудник старше 40 лет: " + nameSurnameSecondname + "; Возраст: " + age);
            break;
        }
    }







}



