package bai2;

public class Bai2 {

    public class Student {

        public String stID;
        public String stName;
        public String stClass;
        Student s = new Student();

        private Student() {
            this.stID = "";
            this.stName = "";
            this.stClass = "";
        }

        private Student(String stID, String StName, String stClass) {
            this.stID = stID;
            this.stName = stName;
            this.stClass = stClass;
        }

        private String getStID() {
            return stID;

        }

        private String getStName() {
            return stName;

        }

        private String getStClass() {
            return stClass;

        }

        private void setStID(String stID) {
            this.stID = stID;

        }

        private void setStName(String stName) {
            this.stName = stName;

        }

        private void setStClass(String stClass) {
            this.stClass = stClass;

        }

        private String ToString() {
            return "(" + this.stID + ";" + this.stName + ";" + this.stClass
                    + ")";
        }

    }

    public class Book {

        public String boCode;
        public String boTitle;
        public String boAuthor;
        Book b = new Book();

        private Book() {
            this.boCode = "";
            this.boTitle = "";
            this.boAuthor = "";
        }

        private Book(String boCode, String boTile, String boAuthor) {
            this.boCode = boCode;
            this.boTitle = boTitle;
            this.boAuthor = boAuthor;
        }

        private Book(Book bo) {
            boCode = bo.boCode;
            boTitle = bo.boTitle;
            boAuthor = bo.boAuthor;
        }

        private String getBoCode() {
            return boCode;

        }

        private String getBoTile() {
            return boTitle;

        }

        private String getBoAuthor() {
            return boAuthor;
        }
    }
}
