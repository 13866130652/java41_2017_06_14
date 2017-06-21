package date0614;

import java.io.*;

public class Sample {
	// ≤‚ ‘
	public static void main(String[] args) {
		Sample sp = new Sample();
		String path = "f:/test/sample.txt";
		String st = "≤‚ ‘◊÷∑˚¥Æ:0123456789 *** ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		File f = new File(path);
		if (!f.exists()) {
			f.getParentFile().mkdirs();
			try {
				f.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		sp.write1(path, st);
		sp.write2(path, st);
		sp.write3(path, st);
		System.out.println(sp.read1(path));
		System.out.println(sp.read2(path));
		System.out.println(sp.read3(path));
	}

	//  Ù–‘
	private Reader read;
	private Writer write;

	// ∂¡»°
	public String read1(String path) {
		StringBuffer sb = new StringBuffer();
		try {
			read = new FileReader(path);
			int n = 0;
			while ((n = read.read()) != -1) {
				sb.append((char) n);
			}
		} catch (Exception e) {
		} finally {
			try {
				read.close();
			} catch (Exception e) {
			}
		}
		return sb.toString();
	}

	public String read2(String path) {
		StringBuffer sb = new StringBuffer();
		try {
			read = new FileReader(path);
			char[] ch = new char[1024];
			int n = 0;
			while ((n = read.read(ch)) != -1) {
				sb.append(ch, 0, n);
			}
		} catch (Exception e) {
		} finally {
			try {
				read.close();
			} catch (Exception e) {
			}
		}
		return sb.toString();
	}

	public String read3(String path) {
		StringBuffer sb = new StringBuffer();
		try {
			read = new FileReader(path);
			char[] ch = new char[1024];
			int n = 0;
			while ((n = read.read(ch, 0, ch.length)) != -1) {
				sb.append(ch, 0, n);
			}
		} catch (Exception e) {
		} finally {
			try {
				read.close();
			} catch (Exception e) {
			}
		}
		return sb.toString();
	}

	// –¥»Î
	public void write1(String path, String st) {
		try {
			write = new FileWriter(path);
			write.write(st);
		} catch (Exception e) {
		} finally {
			try {
				write.close();
			} catch (Exception e) {
			}
		}
	}

	public void write2(String path, String st) {
		try {
			char[] ch = st.toCharArray();
			write = new FileWriter(path);
			write.write(ch);
		} catch (Exception e) {
		} finally {
			try {
				write.close();
			} catch (Exception e) {
			}
		}
	}

	public void write3(String path, String st) {
		try {
			char[] ch = st.toCharArray();
			write = new FileWriter(path);
			write.write(ch, 0, ch.length);
		} catch (Exception e) {
		} finally {
			try {
				write.close();
			} catch (Exception e) {
			}
		}
	}
}
