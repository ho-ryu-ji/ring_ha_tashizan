public class ring_ha_tashizan() {
  public class RingConsumptionCalculator{
    public static final int N = 100;
    private SimpleCar[] rings;
    private int numberOfRings;

    public RingsConsumptionCalculator(){
	    rings = new SimpleRing[N];
	    inputData();
	    System.out.println(getTotalRingsConsumption());
    }

    private int getTotalRingsConsumption(){
      int total = 0;
      for(int i=0; i<numberOfRings; i++) {
				total += rings[i].getRingsConsumption();
      }

      return total;
    }

    private void inputData(){
	    Scanner sc = new Scanner(System.in);
	    while( sc.hasNext() ){
        String type = sc.next();
        String material = sc.next();
        String finger = sc.next();
	      if ( type.equals("Brass") ){
		      rings[numberOfRings++] = new BrassRing(String material);
	      } else if ( type.equals("Flex") ){
          rings[numberOfRings++] = new FlexibleRing();
        } else if ( type.equals("InFlex") ){
          rings[numberOFRings++] = new InFlexibleRing();
        }else if ( type.equals("Silver") ){
		      rings[numberOfRings++] = new SilverRing(distance, 13.0);
	      } else if ( type.equals("Stone") ){
		    rings[numberOfRings++] = new StoneRing(beginTime, endTime, distance,
                timeWithPassengers, 10.5, 6.0);
	      }
    	}
    }

    printrings(){
      for(int i=0; i<num; i++){
        System.out.println()
      }
    }

    public static void main(Strnig[], args) {
      new printrings();
    }
  }
}