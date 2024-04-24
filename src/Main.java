import javax.xml.transform.Source;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int day, month;
        String sign = "";
        boolean isError = false;

        //We ask the user to enter the month and day information.

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay :");
        month = input.nextInt();
        System.out.print("Doğduğunuz gün :");
        day = input.nextInt();

        //"We ensure that the entered month value is between 1 and 12, and the day value is between 1 and 31.

        if (day < 1 || day > 31) {
            isError = true;
        }
        if (month < 1 || month > 12) {
            isError = true;
        }

        //We find the zodiac sign value based on the input provided for each month.

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    sign = "Oğlak";
                } else {
                    sign = "Kova";
                }
            } else {
                isError = true;
            }
        }
        if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    sign = "Kova";
                } else {
                    sign = "Balık";
                }
            } else {
                isError = true;
            }
        }
        if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    sign = "Balık";
                } else {
                    sign = "Koç";
                }
            } else {
                isError = true;
            }
        }
        if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    sign = "Koç";
                } else {
                    sign = "Boğa";
                }
            } else {
                isError = true;
            }
        }
        if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    sign = "Boğa";
                } else {
                    sign = "İkizler";
                }
            } else {
                isError = true;
            }
        }
        if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 24) {
                    sign = "İkizler";
                } else {
                    sign = "Yengeç";
                }
            } else {
                isError = true;
            }
        }
        if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    sign = "Yengeç";
                } else {
                    sign = "Aslan";
                }
            } else {
                isError = true;
            }
        }
        if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    sign = "Aslan";
                } else {
                    sign = "Başak";
                }
            } else {
                isError = true;
            }
        }
        if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    sign = "Başak";
                } else {
                    sign = "Terazi";
                }
            } else {
                isError = true;
            }
        }
        if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    sign = "Terazi";
                } else {
                    sign = "Akrep";
                }
            } else {
                isError = true;
            }
        }
        if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    sign = "Akrep";
                } else {
                    sign = "Yay";
                }
            } else {
                isError = true;
            }
        }
        if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    sign = "Yay";
                } else {
                    sign = "Oğlak";
                }
            } else {
                isError = true;
            }
        }
        if (isError) {//We print the message that the user will receive when they make an incorrect input.
            System.out.print("Hatalı Giriş Yaptınız. Lütfen tekrar deneyiniz.");
        } else {
            System.out.print("Burcunuz : " + sign); //We are printing the zodiac sign value we obtained
        }
    }
}