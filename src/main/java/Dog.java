public class Dog {
    private String name;
    private String breed;
    private int weight;
    
    /**
     * Constructor for the Dog class
     * @param name Name of the dog
     * @param breed Breed of the dog
     * @param weight Weight of the dog
     */
    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    /**
     * Method to get the name of the dog
     * @return Returns the value of name
     */
    public String getName() {
        return this.name;
    }

     /**
     * Method to get the breed of the dog
     * @return Returns the value of breed
     */
    public String getBreed() {
        return this.breed;
    }

     /**
     * Method to get the weight of the dog
     * @return Returns the value of weight
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * Sets the value of name
     * @param name Name of the dog
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the value of breed
     * @param breed Breed of the dog
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Sets the value of weight
     * @param weight Weight of the dog
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
