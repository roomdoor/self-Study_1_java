package ch10;

public class Birthday {

    private int day;
    private int month;
    private int year;


    private boolean isVaild; // boolean의 초기값음 false로 설정됨



    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                if (day < 1 || day > 31) {
                    isVaild = false;
                } else {
                    isVaild = true;
                    this.day = day;
                }

            case 4:
            case 6:
            case 9:
            case 11:

                if ( day < 1 || day > 30) {
                    isVaild =false;
                } else  {
                    isVaild = true;
                    this.day = day;
                }

            case 2:

                if ( day < 1 || day > 28) {
                    isVaild =false;
                } else  {
                    isVaild = true;
                    this.day = day;
                }



        }

//        if (month == 1) {
//            if (day < 1 || day > 31) {
//                isVaild = false;
//            } else {
//                isVaild = true;
//                this.day = day;
//            }
//        } else if (month == 2) {
//            if (day < 1 || day > 28) {
//                isVaild = false;
//            } else {
//                isVaild = true;
//                this.day = day;
//            }
//        } else if (month == 3) {
//            if (day < 1 || day > 31) {
//                isVaild = false;
//            } else {
//                isVaild = true;
//                this.day = day;
//            }
//        } else if (month == 4) {
//            if (day < 1 || day > 30) {
//                isVaild = false;
//            } else {
//                isVaild = true;
//                this.day = day;
//            }
//        } else if (month == 5) {
//            if (day < 1 || day > 31) {
//                isVaild = false;
//            } else {
//                isVaild = true;
//                this.day = day;
//            }
//        } else if (month == 6) {
//            if (day < 1 || day > 30) {
//                isVaild = false;
//            } else {
//                isVaild = true;
//                this.day = day;
//            }
//        } else if (month == 7) {
//            if (day < 1 || day > 31) {
//                isVaild = false;
//            } else {
//                isVaild = true;
//                this.day = day;
//            }
//        } else if (month == 8) {
//            if (day < 1 || day > 31) {
//                isVaild = false;
//            } else {
//                isVaild = true;
//                this.day = day;
//            }
//        } else if (month == 9) {
//            if (day < 1 || day > 30) {
//                isVaild = false;
//            } else {
//                isVaild = true;
//                this.day = day;
//            }
//        } else if (month == 10) {
//            if (day < 1 || day > 31) {
//                isVaild = false;
//            } else {
//                isVaild = true;
//                this.day = day;
//            }
//        } else if (month == 11) {
//            if (day < 1 || day > 30) {
//                isVaild = false;
//            } else {
//                isVaild = true;
//                this.day = day;
//            }
//        } else if (month == 12) {
//            if (day < 1 || day > 31) {
//                isVaild = false;
//            } else {
//                isVaild = true;
//                this.day = day;
//            }
//        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 13) {
            isVaild = false;
        } else {
            isVaild = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void showData() {

        if ( isVaild ) {
            System.out.println(year + "년" + month + "월" + day + "일" + "입니다.");
        } else {
            System.out.println("유효하지 않은 날자 입니다.");

        }

    }
}

