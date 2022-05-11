package task2;

enum Animals {
    GIRAFFE(10), HIPPO(5), ZEBRA(15), LION(35);
    int age;
    Animals(int age){
        this.age=age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animals{");
        sb.append("Animal=").append(super.toString());
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
