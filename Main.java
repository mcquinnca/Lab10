class Main {
  public static void main(String[] args) {
    Sugar Tree = new Sugar("Tree");
    Tree.cutShape(Tree.getShape(), 10);
    Tree.bake(350,10);
    Tree.decorateCookies();

    System.out.println("\n");

    Sugar aCookie = new Sugar();
    aCookie.decorateCookies();

  }
}