package code_uz._map_06_Lesson;

public class Student {


    private Integer id;

    public Student(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return !(id != null ? !id.equals(student.id) : student.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
