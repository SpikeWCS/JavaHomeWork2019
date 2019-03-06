package homework1;

// 饿汉单例模式
public class Singleton {
	
	private static Singleton singleton = new Singleton();
	// 隐藏构造函数
	private Singleton() {
		System.out.println("生成了一个实例");
	}
	// 获取唯一的单例
	public static Singleton getInstance() {
		return singleton;
	}
	
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1 == s2) {
			System.out.println("s1 和 s2 是同一个对象！");
		}else {
			System.out.println("s1 和 s2 不是同一个对象！");
		}
	}

}
