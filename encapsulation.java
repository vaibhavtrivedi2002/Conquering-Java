class encapsulation {
  private String name;
  private int age;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    // You can add logic here to validate age (e.g., non-negative)
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}
