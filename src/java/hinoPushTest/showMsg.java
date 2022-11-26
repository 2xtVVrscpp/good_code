class showMsg{
    public showMsg(){
        System.out.println("showMsg class's constructor is called");
    }

    public void showString(String msg){
        System.out.println("showString is called");
        System.out.println("String:" + msg);
    }

    public void showInteger(int msg){
        System.out.println("showInteger is called");
        System.out.println("Integer:" + msg);
    }
}
