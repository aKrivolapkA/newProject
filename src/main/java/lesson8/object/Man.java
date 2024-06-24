package src.main.java.lesson8.object;


public class Man {
    private String eyesColour;
    private int dnaCode;

    public Man(String eyesColour, int dnaCode) {
        this.eyesColour = eyesColour;
        this.dnaCode = dnaCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { // если один и тот же обьект памяти то будет тру
            return true;
        }
        if (o == null || getClass() != o.getClass()) { // проверка равны ли обьекты ( то есть с одного класса) или обьект равен null
            return false;
        }
        Man man = (Man) o; //преоразование типа

        return dnaCode == man.dnaCode; //условие по которому сравниваем

    }


}
