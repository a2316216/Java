package willy;
class �H��
{	
	int ��=2;
	int ��=2;
	int �f=1;
	int ��=1;
//�򥻸�Ʀ���
public �H��()
{	
	��=2;��=2;�f=1;��=1;
	System.out.println("��=2;��=2;�f=1;��=1");
}
public �H��(int z,int x,int c,int v)
{	
	��=z;��=x;�f=c;��=v;
	System.out.println("��="+z+"��="+x+"�f="+c+"��="+v);
}
//�غc�������A�i�h��
	
	void �Y(String name){
		System.out.println(name+"�I�s�Y����k");
		}
	void show(String name){
		//String ��="�ϰ��ܼ�";
		System.out.println(name+"��="+��+" ��="+��+" �f="+�f+" ��="+��);
		System.out.println("��="+this.��+" ��="+this.��+" �f="+this.�f+" ��="+this.��);
	}
	void set(int z,int x,int c,int v,String name){
		if(z<0||x<0||c<0||v<0)
			System.out.println("�ƭȤ��i���t");
		else{
			��=z;��=x;�f=c;��=v;
		}show(name);
	}
	void set(int z,int x,int c,String name){
		if(z<0||x<0||c<0)
			System.out.println("�ƭȤ��i���t");
		else{
			this.��=z;��=x;�f=c;
		}show(name);
		System.out.println();
	}
	void set(int z,int x,String name){
		if(z<0||x<0)
					System.out.println("�ƭȤ��i���t");
		else{
			this.��=z;��=x;;
		}show(name);
	}
	void set(int z,String name){
			if(z<0)
			System.out.println("�ƭȤ��i���t");
		else{
			this.��=z;
			}show(name);
	}
	//��k����
	
public void A(�H�� Z){
	if(Z==this)
		System.out.println("�P�@�H");
	else
		System.out.println("���P�H");		
	}
}

class ��l extends �H��{
	��l(){};
	��l(int z,int x,int c,int v){
		
		��=z;��=x;�f=c;��=v;
		System.out.println("��l\n��="+z+"��="+x+"�f="+c+"��="+v);
	};	
	protected void show(){
		
		System.out.println("��l");
	}
}




