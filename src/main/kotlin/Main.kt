fun main(args: Array<String>) {
  val student1 = OrganiseStudents("Mikisa Priscilla", 90.00)
    student1.classroom()
    val student2= OrganiseStudents("Smartha Mukama", 55.00)
    student2.classroom()
    val student3 = OrganiseStudents("Charity Marano", 65.00)
    student3.classroom()
    val student4 = OrganiseStudents("Anisha Kirabo", 20.00)
    student4.classroom()
    val student5 = OrganiseStudents("Suzan Favour", 98.00)
    student5.classroom()
}
//Create a programme that organises students in specific classrooms according to their performances.

//Pseudo Code
//1. Input the name of the student and their average mark.
//2. Input the classroom name.
//3. Determine which student has higher marks than the other.
//4. Arrange them in that order putting an equal number of students in each classroom.
//5. Output a table with lists of each classroom and its students' respective students' names.

class OrganiseStudents(var name:String, var averageMark:Double){
    fun classroom(){
        if (averageMark >= 80){
            println("$name In AnitaB Lab")
        }
        else if(averageMark < 80 && averageMark > 60){
            println("$name In Lovelace Lab")
        }
        else{
            println ("$name In Ada Lab")
        }
    }
}