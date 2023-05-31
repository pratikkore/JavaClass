package AugastWrritenTest;

//5)find output
class Test {
	int count = 0;

	void A() throws Exception {
		try {
			count++;
			try {
				count--;
				try {
					count += 2;
					throw new Exception();
				} catch (Exception ex) {
					count++;
					throw new Exception();
				}
			}

			catch (Exception ex) {
				count += 3;
			}
		}

		catch (Exception ex) {
			count++;
		}

	}

	void display() {
		System.out.println(count);
	}

	public class Problem5 {

		public void main(String[] args) {
			Test obj = new Test();
			try {
				obj.A();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			obj.display();
		}

	}
}

//Output= try surrounding try n catch
