package willy;
class 人類
{	
	int 眼=2;
	int 耳=2;
	int 口=1;
	int 鼻=1;
//基本資料成員
public 人類()
{	
	眼=2;耳=2;口=1;鼻=1;
	System.out.println("眼=2;耳=2;口=1;鼻=1");
}
public 人類(int z,int x,int c,int v)
{	
	眼=z;耳=x;口=c;鼻=v;
	System.out.println("眼="+z+"耳="+x+"口="+c+"鼻="+v);
}
//建構員成員，可多載
	
	void 吃(String name){
		System.out.println(name+"呼叫吃的方法");
		}
	void show(String name){
		//String 眼="區域變數";
		System.out.println(name+"眼="+眼+" 耳="+耳+" 口="+口+" 鼻="+鼻);
		System.out.println("眼="+this.眼+" 耳="+this.耳+" 口="+this.口+" 鼻="+this.鼻);
	}
	void set(int z,int x,int c,int v,String name){
		if(z<0||x<0||c<0||v<0)
			System.out.println("數值不可為負");
		else{
			眼=z;耳=x;口=c;鼻=v;
		}show(name);
	}
	void set(int z,int x,int c,String name){
		if(z<0||x<0||c<0)
			System.out.println("數值不可為負");
		else{
			this.眼=z;耳=x;口=c;
		}show(name);
		System.out.println();
	}
	void set(int z,int x,String name){
		if(z<0||x<0)
					System.out.println("數值不可為負");
		else{
			this.眼=z;耳=x;;
		}show(name);
	}
	void set(int z,String name){
			if(z<0)
			System.out.println("數值不可為負");
		else{
			this.眼=z;
			}show(name);
	}
	//方法成員
	
public void A(人類 Z){
	if(Z==this)
		System.out.println("同一人");
	else
		System.out.println("不同人");		
	}
}

class 兒子 extends 人類{
	兒子(){};
	兒子(int z,int x,int c,int v){
		
		眼=z;耳=x;口=c;鼻=v;
		System.out.println("兒子\n眼="+z+"耳="+x+"口="+c+"鼻="+v);
	};	
	protected void show(){
		
		System.out.println("兒子");
	}
}




