/*
 * 01 02 03 04 05
 * 06 07 08 09 10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25
 */

/*
 * How print format statement works for LINE NO 27 HERE
 * | Part  | Meaning (in simple words)          |
| ----- | ---------------------------------- |
| `%`   | Start of formatting                |
| `0`   | Fill empty space with **zero**     |
| `2`   | Total width = **2 characters**     |
| `d`   | Print an **integer number**        |
| `" "` | Add **one space after the number** |

 */
public class PatternProblemUnique {
public static void main(String[] args) {
	int num=1;
	for(int line=1;line<=5;line++)
	{
		for(int pattern=1;pattern<=5;pattern++)
		{
			System.out.printf("%02d ",num);
			num++;
		}
		System.out.println();
	}
}
}
