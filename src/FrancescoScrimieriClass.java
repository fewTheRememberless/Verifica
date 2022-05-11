/**
 * 
 */

/**
 * @author franc
 * 
 * <HTML>
 * <b>FrancescoScrimieri</b>
 * <U> FrancescoScrimieriClass </U>
 * <i> 11/05/2022 </i>
 * </HTML>
 *
 */
public class FrancescoScrimieriClass {
	
	public FrancescoScrimieriClass()
	{
		
	}
	/**
	 * @param s indice iniziale 
	 * @param f indice finale
	 * @return produttoria tra i numeri s ed f
	 */
	public int ScrimieriMet(int s, int f)
	{
		int r = 0;
		for(int i = 1; i < f; i++)
		{
			r = f*i;
		}
		return r;
	}
	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrancescoScrimieriClass f = new FrancescoScrimieriClass();
		System.out.println(f.ScrimieriMet(5, 7));

	}

}
