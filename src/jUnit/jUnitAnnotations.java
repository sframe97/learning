package jUnit;

import org.junit.*;

public class jUnitAnnotations {
//    @BeforeClass
//    public static void beforeAll() {
//        System.out.println("inainte de toate");
//    }
//
//    @AfterClass
//    public static void afterAll() {
//        System.out.println("dupa de toate");
//    }
//
//    @Before
//    public void before() {
//        System.out.println("ruleaza inainte de fiecare test");
//    }
//
//    @After
//    public void after() {
//        System.out.println("se ruleaza dupa fiecare test");
//    }
//
//    @Test
//    public void test1() {
//        System.out.println("sunt primul test");
//        int nr1 = 3;
//        int nr2 = 3;
//        Assert.assertEquals(nr1, nr2);
//    }
//
//    @Test @Ignore
//    public void test2() {
//        System.out.println("sunt al 2-lea test");
//        int nr1 = 3;
//        int nr2 = 4;
//        Assert.assertEquals(nr1, nr2);
//    }
    // inainte sa incep cursu de automation am citit despre testare automata
// cand termin cursul va trebui sa predau un proiect
//inainte de fiecare curs fac recapitulare
//dupa fiecare curs imi fac tema
//fac un test in care verific daca nota de la tema e 10
// fac un test in care verific daca mi-am facut tema

    @AfterClass
    public static void afterAll(){
        System.out.println("Cand termin cursul");
    }

    @Before
    public void before(){
        System.out.println("inainte de fiecare curs, fac recapitulare");
    }

    @After
    public void after(){
        System.out.println("dupa fiecare curs imi fac tema");
    }

    @Test
    public void test(){
        System.out.println("verific daca nota e 10");
        int nr1 = 10;
        int nr2 = 10;
        Assert.assertEquals(nr1,nr2);
    }
    @Test
    public void test2(){
        System.out.println("VERIFIC daca am facut tema");
        boolean da = false;
       // boolean nu = false;
        Assert.assertTrue(da);
    }
}
