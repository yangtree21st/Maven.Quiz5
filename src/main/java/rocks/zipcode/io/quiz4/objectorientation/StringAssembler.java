package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character delimeter;
    private StringBuilder sb;


    public StringAssembler(Character delimiter) {
        this.delimeter = delimiter;
        this.sb = null;
    }

    public StringAssembler append(String str) {
        if (sb == null) {
            sb = new StringBuilder(str);
        } else {

        sb.append(delimeter);
        sb.append(str);


        }
        return this;
    }

    public String assemble() {
        return sb.toString();
    }
}
