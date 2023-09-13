import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Sneaker Pimps - one Underground");
    desertIslandPlaylist.add("Sneaker Pimps - two Underground");
    desertIslandPlaylist.add("Sneaker Pimps - three Underground");
    desertIslandPlaylist.add("Sneaker Pimps - four  Underground");
    desertIslandPlaylist.add("Sneaker Pimps - five Underground");
    desertIslandPlaylist.add("Sneaker Pimps - Six Underground");
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove("Sneaker Pimps - Six Underground");
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove("Gramatik - Good Evening, Mr. Hitchcock");
    desertIslandPlaylist.remove("Erykah Badu - Drama");
    desertIslandPlaylist.remove("The Modern Jazz Quartet - Django");
    desertIslandPlaylist.remove("MF DOOM - Guinnesses");
    desertIslandPlaylist.remove("Jean Grae - Threats");
    
    // System.out.println(desertIslandPlaylist);
    
    // swapping songs
    int indexA = desertIslandPlaylist.indexOf("Buena Vista Social Club - Murmullo");
    int indexB = desertIslandPlaylist.indexOf("A Tribe Called Quest - Electric Relaxation");
    
    String tempA = "Buena Vista Social Club - Murmullo";
    
    desertIslandPlaylist.set(indexA, "A Tribe Called Quest - Electric Relaxation");
    // System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
    
  }
  
}
