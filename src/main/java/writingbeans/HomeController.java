package writingbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import beansdemo.Juggler;
import beansdemo.Performer;
import beansdemo.PoeticJuggler;
import beansdemo.Sonnet;
import beansdemo.Stage;

@Controller
public class HomeController {

	@RequestMapping("/")
	@ResponseBody
	public String homePage() {
		
//		return "welcome to ...";
		
		// get context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("IoC.xml");
		
		// default constructor
//		Performer performer = (Performer) ctx.getBean("duke");
//		return performer.perform();

		//custom constructor simple value
//		Performer performer = (Performer) ctx.getBean("duke2");
//		return performer.perform();
		
		//custom constructor pass by ref
//		Performer performer = (Performer) ctx.getBean("poeticDuke");
//		return performer.perform();
		
		// Dù là khác loại object nhưng vẫn xài tự nhiên nhờ vào interface, khá good phải không :D
		
		
		// FActory
//		Stage stage = (Stage) ctx.getBean("theStage");
//		Stage stage2 = (Stage) ctx.getBean("theStage");
//		stage2.check();
//		stage.check();
//		return "factory bean excuting";
		
		//Scope
		// test  to see difference
//		Performer performer = (Performer) ctx.getBean("poeticDuke");
//		Performer performer2 = (Performer) ctx.getBean("poeticDuke");
//		performer2.perform();
		
//		Performer performer = (Performer) ctx.getBean("protype");
//		Performer performer2 = (Performer) ctx.getBean("protype");
//		performer2.perform();
//		return performer.perform();
		
		//==> su khac biet giua factory va scope la gi?
//		Stage stage = (Stage) ctx.getBean("theStage");
//		Stage stage2 = Stage.getInstance();
//		stage2.check();
//		stage.check();
//		return "factory bean excuting";
		
//		Performer performer = (Performer) ctx.getBean("poeticDuke");
//		Performer performer2 = new PoeticJuggler(15, new Sonnet());
//		performer2.perform();
//		return performer.perform();
		// du la singletone nhung no van la 2 object ring khi tao = java code
		// vay neu k muon ng ta cos the tao ra 1 cai nao khac ngoai cai do thi dung den factory
		
		// 1 so cach khac. vd inject with properties==========================
//		Performer performer = (Performer) ctx.getBean("kenny");
//		return performer.perform();
		
		// ref - peoperty
//		Performer performer = (Performer) ctx.getBean("kenny2");
//		return performer.perform();
		
		// tac dung cua properties la interface -choi nhieu loai nhac cu khac nhau
//		Performer performer = (Performer) ctx.getBean("kenny3");
//		return performer.perform();
		
		// Inner beans
//		Performer performer = (Performer) ctx.getBean("kenny4");
//		return performer.perform();
		//==============
		
		// p namespace
//		Performer performer = (Performer) ctx.getBean("kenny5");
//		return performer.perform();
		
		// Collection
//		Performer performer = (Performer) ctx.getBean("hank");
//		return performer.perform();
		
		// Spel
		Performer performer = (Performer) ctx.getBean("spel");
		return performer.perform();
		// cai nay thi thang kia cung lam duoc. co gi hay hon k?
		// co gom dung ham, properties cua thang khac, bieu thuc dieu kien, chon chieu cac thu
	}
}
