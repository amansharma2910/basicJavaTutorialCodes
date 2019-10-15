package getterAndSetter;

/*

*Getter and setter methods are used to avoid the exception of invalid member variable when in case you decide to change the member variable names in the master class while keeping the variables unchanged in the in other classes in the same project/package.

* While using the getter and setter methods inside the other classes, we do not access the member variables of the masterclass directly, but we do it indirectly. So any change in the masterclass doesn't affect the variables in the other class directly. As a result, even upon changing the variable names, we do not get an exception/error.
*/

public class ClassroomGetterAndSetter {
    private String sub;
    private int stdCount;

    public void setSubj(String subject) {
        this.sub = subject;
    }

    public void setStudCount(int studentCount) {
        this.stdCount = studentCount;
    }

    public void classDetails(){
        System.out.println("This is " + sub + " class and it has " + stdCount + " students.");
    }

}
