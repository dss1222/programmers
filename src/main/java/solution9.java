class Solution9 {
    public String solution(String phone_number) {
        String answer = "";

        int phonenumber = phone_number.length() - 4;

        for (int i = 0; i < phonenumber; i++) {
            answer += "*";
        }

        answer+= phone_number.substring(phonenumber);

        return answer;
    }
}