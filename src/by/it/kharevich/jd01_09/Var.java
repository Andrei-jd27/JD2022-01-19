package by.it.kharevich.jd01_09;

abstract class Var implements Operation {

    public static Var create(String varValue) {
        if (varValue.matches(by.it._classwork_.jd01_09.Patterns.SCALAR)){
            return new Scalar(varValue);
        } else if (varValue.matches(by.it._classwork_.jd01_09.Patterns.VECTOR)){
            return new Vector(varValue);
 //       } else if (varValue.matches(Patterns.MATRIX)){
 //           return new Matrix(varValue);
        } else
            return null; //TODO ex
    }

    @Override
    public Var add(Var other) {
        System.out.printf("Operation addition %s + %s impossible%n",this, other);
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.printf("Operation subtraction %s - %s impossible%n",this, other);

        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.printf("Operation multiplication %s * %s impossible%n",this, other);

        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.printf("Operation division %s / %s impossible%n",this, other);

        return null;
    }

    @Override
    public String toString() {
        return "abstract variable";
    }
}