package practical;

public class Calc {

    int mark1;
    int mark2;
    int mark3;

    public Calc(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public String getDivision() {
        int total = (mark1 + mark2 + mark3) / 3;

        if (total >= 75 && total <= 100) {
            return "First division with distinction";
        } else if (total >= 60 && total <= 74) {
            return "First division";
        } else if (total >= 50 && total <= 59) {
            return "Second division";
        } else if (total >= 40 && total <=49) {
        	return "Third division";
        } else if (total >= 0 && total <=39) {
        	return "Fail";
        } else {
        	return "Not a valid output";
        }
    }
}
