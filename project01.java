package teamwork01;

import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.Player;

public class project01 {
	public static void main(String[] args) throws Exception {

		Scanner scanStr = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		Random r = new Random();

		// System.out.println("playerの人数を選択してください");
		// System.out.println("1:1player 2:2player 3:3player ");
		// int choice = scanInt.nextInt();

		int Whealth;
		int Mhealth;
		int kappahealth;
		int Wdamage;
		int Mdamage;
		int kappadamage;
		int Wdefence;
		int Mrecovery;
		int defence = 0;
		int recovery = 0;
		int Ohealth;
		int Odamage;
		int Orecovery;

		// if (choice == 1) {
		System.out.println("====================================");

		System.out.println("       RPG ADVENTURE GAME");

		System.out.println("====================================");

		System.out.println();

		System.out.println("Playerの名前を入力してください");

		System.out.print(">>>");

		String name = scanStr.nextLine();

		System.out.println("         ようこそ :" + name + ",さん");

		System.out.println(" ❤️ Welcome to the adventure World ❤️");

		System.out.println("   ---------------------------------");

		System.out.println("Playerのタイプを選んでください");

		System.out.println("  1:ウォリアー  ");

		System.out.println("  2:メイジ");

		System.out.print(">>>");

		int type = scanInt.nextInt();
		Whealth = 100;

		Mhealth = 90;

		kappahealth = 100;

		if (type == 1) {

			System.out.println("\nウォリアーになりました");

			System.out.println("ウォリアー's STATS");

			System.out.println("HEALTH:100 DAMAGE:25 DEFENCE:+5");
			while (true) {

				System.out.println("\n================================");

				System.out.println("           LEVEL 1");

				System.out.println("        KAPPA Appears!");

				System.out.println("================================");

				System.out.println("          KAPPA's STATS");

				System.out.println("HEALTH:100 DAMAGE:25 RECOVERY:+0");

				System.out.println(" ");

				System.out.println("Let's Go");

				// System.out.println("行動を選んでください！");
				// System.out.println("1:Fight 2:run");
				// int choice1 = scanInt.nextInt();

				// if (choice == 1) {

				while (Whealth > 0 || kappahealth > 0) {
					Wdamage = r.nextInt((25) + 1);

					Wdefence = r.nextInt((10) + 1);

					kappadamage = r.nextInt((20) + 1);

					System.out.println(name + "'s Health:" + Whealth + "/100");

					System.out.println("KAPPA's Health:" + kappahealth + "/100");

					System.out.println("何したい選んでください");

					System.out.println("  1:Attack ");

					System.out.println("  2:Defence");

					System.out.print(">>>");

					int action = scanInt.nextInt();

					if (action == 1) {
						int attack = Wdamage;
						kappahealth -= attack;
						play1();
						System.out.println("  " + name + "Attacks!!");
						System.out.println("  " + attack + "Damage");
					} else if (action == 2) {

						defence += Wdefence;
						play2();
						System.out.println("  " + name + " Defence!");
						System.out.println("  " + defence + "+ Defence");

					} else {
						System.out.println("Please enter a valid number");
					}

					if (defence > 0 && kappahealth > 0) {
						int kappaATK = (kappadamage - defence);

						if (kappaATK < 0) {
							kappaATK = 0;
						}

						Whealth -= kappaATK;

						System.out.println("  " + "KAPPA attacks !");
						System.out.println("  " + kappaATK + " Damage");
					} else if (kappahealth > 0) {
						int kappaATK = kappadamage;
						Whealth -= kappaATK;
						System.out.println("  " + "KAPPA Attacks!");
						System.out.println("  " + kappaATK + " Damage");
						System.out.println("------------------------");
					}

					if (kappahealth <= 0) {

						break;
					}

					if (Whealth <= 0) {
						System.out.println("YOU've been defeated!!");
						System.out.println(" -------------------- ");
						break;
					}

				}
				if (kappahealth <= 0) {
					play3();
					System.out.println("------------------------");

					System.out.println("YOU've passed the level 1");

					System.out.println("------------------------");

					System.out.println("  ");

					System.out.println("Your status increase by 10");

					System.out.println("------------------------");

					System.out.println("  ");
					break;
				} else if (Whealth <= 0) {
					play4();
					System.out.println("===========");
					System.out.println(" GAME OVER ");
					System.out.println("===========");
					break;
				}

				// } this is level 1 end

			} //type
				// this is level 2
			while (kappahealth <= 0) {
				System.out.println("\n================================");

				System.out.println("           LEVEL 2");

				System.out.println("       👹 ONI Appears!");

				System.out.println("================================");

				Whealth = 110;

				System.out.println("       ウォリアー's STATS");

				System.out.println("HEALTH:110 DAMAGE:35 DEFENCE:+15");

				System.out.println("  ");

				System.out.println("        ONI's STATS");

				System.out.println("HEALTH:150 DAMAGE:30 RECOVERY:+5");

				System.out.println("-------------------------------- ");
				Ohealth = 150;

				while (Whealth > 0 || Ohealth > 0) {
					Wdamage = r.nextInt((25) + 1) + 10;

					Wdefence = r.nextInt((5) + 1) + 10;

					Odamage = r.nextInt((30) + 1);

					System.out.println(name + "'s Health:" + Whealth + "/110");

					System.out.println(" Oni's Health:" + Ohealth + "/100");

					System.out.println("何したい選んでください");

					System.out.println("  1:Attack ");

					System.out.println("  2:Defence");

					System.out.print(">>>");

					int action = scanInt.nextInt();

					System.out.println("   ");

					if (action == 1) {
						int attack = Wdamage;
						Ohealth -= attack;
						play1();
						System.out.println("  " + name + " Attacks!!");
						System.out.println("  " + attack + " Damage");
					} else if (action == 2) {

						defence += Wdefence;
						play2();
						System.out.println("  " + name + " Defence!");
						System.out.println("  " + defence + "+ Defence");
					} else {
						System.out.println("Please enter a valid number");
					}

					if (defence > 0 && kappahealth > 0) {
						int OATK = (Odamage - defence);

						if (OATK < 0) {
							OATK = 0;
						}

						Whealth -= OATK;

						System.out.println(" " + " ONI attacks!! ");
						System.out.println(" " + OATK + " Damage");
					} else if (Ohealth > 0) {
						int OATK = Odamage;
						Whealth -= OATK;
						System.out.println(" " + "ONI attacks");
						System.out.println(" " + OATK + " Damage");
					}

					if (Ohealth <= 0) {

						break;
					} else if (Whealth <= 0) {
						System.out.println("YOU've been defeated!!");
						System.out.println(" -------------------- ");
						break;
					}

				}
				if (Ohealth <= 0) {
					play3();
					System.out.println("------------------------");

					System.out.println("YOU've passed the level 2");

					System.out.println("------------------------");

					System.out.println("  ");
					System.out.println("================================");
					System.out.println("YOU've now clear all the levels");
					System.out.println("================================");
					System.out.println("  ");
					System.out.println("🎉🎉 Congratulations 🎉🎉");

					break;
				} else if (Whealth <= 0) {
					play4();
					System.out.println("===========");
					System.out.println(" GAME OVER ");
					System.out.println("===========");
					break;
				}
				break;
			}
			//this is W level2 end

			// this is Mage

		} else if (type == 2) {
			System.out.println("\nメイジになりました");

			System.out.println("メイジ's STATS");

			System.out.println("HEALTH:90 DAMAGE:30 HEAL:+5");
			while (true) {

				System.out.println("\n================================");

				System.out.println("           LEVEL 1");

				System.out.println("        KAPPA Appears!");

				System.out.println("================================");

				System.out.println("          KAPPA's STATS");

				System.out.println("HEALTH:100 DAMAGE:25 RECOVERY:+0");

				System.out.println(" ");

				System.out.println("Let's Go");

				// System.out.println("行動を選んでください！");
				// System.out.println("1:Fight 2:run");
				// int choice1 = scanInt.nextInt();

				// if (choice == 1) {

				while (Mhealth > 0 || kappahealth > 0) {
					Mdamage = r.nextInt((25) + 1);
					Mrecovery = r.nextInt((5) + 1);
					recovery = 0;
					kappadamage = r.nextInt((20) + 1);

					System.out.println(name + "'s Health:" + Mhealth + "/90");

					System.out.println("KAPPA's Health:" + kappahealth + "/100");

					System.out.println("何したい選んでください");

					System.out.println("  1:Attack ");

					System.out.println("  2:Heal");

					System.out.print(">>>");

					int action = scanInt.nextInt();

					if (action == 1) {
						int attack = Mdamage;
						kappahealth -= attack;
						play1();
						System.out.println("  " + name + "Attacks!!");
						System.out.println("  " + attack + " Damage");
					} else if (action == 2) {

						recovery += Mrecovery;

						System.out.println(" " + name + " Heal!");
						Mhealth += recovery;
						System.out.println("Health restored by" + recovery + "Health");
						System.out.println(" " + name + "'s Health:" + Mhealth + "/90");
					} else {
						System.out.println("Please enter a valid number");
					}
					// if (recovery > 0 && kappahealth > 0) {
					// int kappaATK = kappadamage;
					// Mhealth -= kappaATK;
					// System.out.println("KAPPA attacks" + kappaATK + "Damage");
					//
					// } else
					if (kappahealth > 0) {
						int kappaATK = kappadamage;
						Mhealth -= kappaATK;
						System.out.println(" " + "KAPPA Attacks!! ");
						System.out.println(" " + kappaATK + " Damage");
					}
					if (kappahealth <= 0) {

						break;
					} else if (Mhealth <= 0) {
						play4();
						System.out.println("YOU've been defeated!!");
						System.out.println(" -------------------- ");
						break;
					}

				}
				if (kappahealth <= 0) {
					System.out.println("------------------------");

					System.out.println("YOU've passed the level 1");

					System.out.println("------------------------");

					System.out.println("  ");

					System.out.println("Your status increase by 10");

					System.out.println("------------------------");

					System.out.println("  ");
					break;
				} else if (Mhealth <= 0) {
					play4();
					System.out.println("===========");
					System.out.println(" GAME OVER ");
					System.out.println("===========");
					break;
				}

				// } this is level 1 end

			} //type
				// this is level 2
			while (kappahealth <= 0) {
				System.out.println("\n================================");

				System.out.println("           LEVEL 2");

				System.out.println("       👹 ONI Appears!");

				System.out.println("================================");

				Mhealth = 100;

				System.out.println("       メイジ's STATS");

				System.out.println("HEALTH:100 DAMAGE:40 HEAL:+15");

				System.out.println("  ");

				System.out.println("        ONI's STATS");

				System.out.println("HEALTH:150 DAMAGE:30 RECOVERY:+5");

				System.out.println("-------------------------------- ");
				Ohealth = 150;

				while (Mhealth > 0 || Ohealth > 0) {
					Mdamage = r.nextInt((25) + 1) + 10;
					Mrecovery = r.nextInt((5) + 1) + 10;
					recovery = 0;
					Odamage = r.nextInt((30) + 1);
					// Orecovery = r.nextInt((5) + 1);
					System.out.println(name + "'s Health:" + Mhealth + "/100");

					System.out.println("Oni's Health:" + Ohealth + "/100");

					System.out.println("何したい選んでください");

					System.out.println("  1:Attack ");

					System.out.println("  2:Defence");

					System.out.print(">>>");
					int action = scanInt.nextInt();
					System.out.println("   ");

					if (action == 1) {
						int attack = Mdamage;
						Ohealth -= attack;
						play1();
						System.out.println(" " + name + " Attacks!!");
						System.out.println(" " + attack + " Damage");
					} else if (action == 2) {
						recovery += Mrecovery;

						System.out.println("  " + name + " Heal!");
						Mhealth += recovery;
						System.out.println("   ");
						System.out.println("Your health has been restored by" + recovery + "Health");
						System.out.println("    ");
						System.out.println("  " + name + "'s Health:" + Mhealth + "/90");
					} else {
						System.out.println("Please enter a valid number");
					}
					// if (recovery > 0 && Ohealth > 0) {
					// int OATK = Odamage;
					// Mhealth -= OATK;
					// System.out.println("ONI attacks " + OATK + " Damage");
					// Mhealth += recovery;
					// System.out.println("Your health has been restored by " + recovery + " HEALTH");
					// } else
					if (Ohealth > 0) {
						int OATK = Odamage;
						Mhealth -= OATK;
						System.out.println("  " + "ONI Attacks!! ");
						System.out.println("  " + OATK + " Damage");
					}
					if (Ohealth <= 0) {

						break;
					} else if (Mhealth <= 0) {
						System.out.println("YOU've been defeated!!");
						System.out.println(" -------------------- ");
						break;
					}

				}
				if (Ohealth <= 0) {
					play3();
					System.out.println("------------------------");

					System.out.println("YOU've passed the level 2");

					System.out.println("------------------------");

					System.out.println("  ");
					System.out.println("================================");
					System.out.println("YOU've now clear all the levels");
					System.out.println("================================");
					System.out.println("  ");
					System.out.println("🎉🎉 Congratulations 🎉🎉");
					break;
				} else if (Mhealth <= 0) {
					play4();
					System.out.println("===========");
					System.out.println(" GAME OVER ");
					System.out.println("===========");
					break;
				}
				break;
			}
			//this is W level2 end

			// this is Mage

		} //player type
	}
	// } //player nums

	public static void play1() throws Exception {

		FileInputStream fis = new FileInputStream("剣で斬る5.mp3");
		Player player = new Player(fis);

		player.play();

	}

	public static void play2() throws Exception {

		FileInputStream fis = new FileInputStream("大勢で拍手.mp3");
		Player player = new Player(fis);

		player.play();
	}

	public static void play3() throws Exception {

		FileInputStream fis = new FileInputStream("軽いパンチ2.mp3");
		Player player = new Player(fis);

		player.play();
	}

	public static void play4() throws Exception {

		FileInputStream fis = new FileInputStream("オーラ2.mp3");
		Player player = new Player(fis);

		player.play();

	}

}
