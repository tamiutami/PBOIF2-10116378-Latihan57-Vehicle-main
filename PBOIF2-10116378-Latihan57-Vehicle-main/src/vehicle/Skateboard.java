/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author Sri Utami Ningsih
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116378
 * Deskripso : program ini berisi program yang menampilkan konstruktor dari Vehicle
 */
class Skateboard extends Vehicle{
    private double myBoardLength;

    public Skateboard() {
    System.out.println("SkateBoard");
    super.setBrand("Ally Skate");
    System.out.println("Brand : " + super.getBrand());
    super.setModel("Rocket");
    System.out.println("Model : " + super.getModel());
    setBoardLength(54.5);
    System.out.println("Panjangnya Board : " + getBoardLength());
    }

    public double getBoardLength() {
        return myBoardLength;
    }

    public void setBoardLength(double boardLength) {
        this.myBoardLength = boardLength;
    }
}
