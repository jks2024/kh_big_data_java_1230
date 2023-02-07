package 게임만들기;
// 쓰레드 생성, GameThA 전사 캐릭터에 대한 구현 부
public class GameThA extends Thread {
    private Character warrior;
    private Character wizard;

    public GameThA(Character warrior, Character wizard) {
        this.warrior = warrior; // 전사
        this.wizard = wizard;   // 마법사
    }
    @Override
    public void run() {
        int normal;
        int special; // 특수 공격에 대한 확률 구하기
        boolean endGame = false; // 게임에 대한 종료 여부
        while (true) {
            try {
                sleep(3300); // 3.3초 마다 반복
                normal = (int) (Math.random() * 2); // 50% 확률
                special = (int) (Math.random() * 18); // 1/18 확률
                if(normal == 1) {
                    System.out.println("마법 공격 : " + warrior.name + "에게" + wizard.mAttack() + "데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.pAttack());
                } else {
                    System.out.println("물리 공격 : " + warrior.name + "에게" + wizard.mAttack() + "데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.mAttack());
                }
                if(special == 10) { // 1/18 확률
                    System.out.println(wizard.name + "궁극기 발동 !!!, " + warrior.name + "에게" +
                            wizard.ultimate() + "데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.ultimate());
                }
                if(endGame) {
                    System.exit(0);
                }
            } catch (InterruptedException e) {}
        }
    }


}
