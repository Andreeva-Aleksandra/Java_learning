public class Block {
  private int width, length, height;
  
  public Block(int[] array) {
      this.width = array[0];
      this.length = array[1];
      this.height = array[2];
  }
  public int getWidth() { 
    return this.width; 
  }
  
  public int getLength() { 
    return this.length; 
  }
  
  public int getHeight() { 
    return this.height; 
  }
  
  public int getVolume() { 
    return this.width * this.length * this.height; 
  }
  
  public int getSurfaceArea() { 
    return 2*(width*(length+height) + length*height); 
  }
}
