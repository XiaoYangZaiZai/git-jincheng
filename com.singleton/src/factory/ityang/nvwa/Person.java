package factory.ityang.nvwa;

interface Person {
    void display_person();
}

class Man implements Person{

    @Override
    public void display_person() {
        System.out.println("女娲造了一个男人");
    }
    Man(){}
}


class Woman implements Person{

    @Override
    public void display_person() {
        System.out.println("女娲造了一个女人");
    }
    Woman(){}
}