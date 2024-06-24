package src.main.java.lesson9.exception;

public class Dog {
    private String name;
    private boolean isCollarPutOn;
    private boolean isLeashPutOn;
    private boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCollarPutOn() {
        return isCollarPutOn;
    }


    public void setCollarPutOn(boolean collarPutOn) {
        isCollarPutOn = collarPutOn;
    }

    public boolean isLeashPutOn() {
        return isLeashPutOn;
    }

    public void setLeashPutOn(boolean leashPutOn) {
        isLeashPutOn = leashPutOn;
    }

    public boolean isMuzzlePutOn() {
        return isMuzzlePutOn;
    }

    public void setMuzzlePutOn(boolean muzzlePutOn) {
        isMuzzlePutOn = muzzlePutOn;
    }

    public void putCollur() {
        System.out.println("Ошейник надет! ");
        this.isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("поводок надет! ");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("намордник надет! ");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException { //DogIsNotReadyException  наше исключение которое мы создали
        if (isCollarPutOn && isLeashPutOn &&isMuzzlePutOn){
            System.out.println("Идем гулять " + name + "Очень доволен ");
        }else{
            throw new DogIsNotReadyException("Собака  "+ name + "не готова к пробулке!");
        }
    }
}
