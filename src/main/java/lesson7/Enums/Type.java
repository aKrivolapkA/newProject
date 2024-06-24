package src.main.java.lesson7.Enums;

public enum Type {

    INT(true) { //инт это целый класс внутри которого мы можем писать целые методы
        @Override
        public Object parse(String value) {
            return Integer.valueOf(value);
        }
    },
    INTEGER(false) {
        @Override
        public Object parse(String value) {
            return Integer.valueOf(value);
        }
    },
    STRING(false) {
        @Override
        public Object parse(String value) {
            return value;
        }
    };

    boolean primitive;

    Type(boolean primitive) {
        this.primitive = primitive;
    }

    public boolean isPrimitive(){
        return primitive;
    }
    public  abstract  Object parse(String value);//абстракртный метод нудно переопределить для кажого знаяечние

}
