package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student  {
    private Integer id;
    private Double studyTime ;
    private Student student;


    public Student() {
        this(null);
        studyTime = 0.0;
    }

    public Student(Integer id) {
        this.id = id;
        studyTime = 0.0;
    }

    public int getId(Student student){
        return student.id;
    }

    public void learn(Double amountOfHours) {
         studyTime += amountOfHours;

    }

    public Double getTotalStudyTime() {
        return studyTime ;
    }


}
