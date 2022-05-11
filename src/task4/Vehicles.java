package task4;

enum Vehicles {
    BMW(5000){
        String getColor(){
            return "Yellow";
        }
    }, AUDI(15131) {
        @Override
        String getColor() {
            return "Black";
        }
    };
    private int price;

    Vehicles(int price){
        this.price =price;
    }
    abstract String getColor();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicles{");
        sb.append("Vehicle=").append(super.toString());
        sb.append(", price=").append(price);
        sb.append(", color='").append(getColor()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
