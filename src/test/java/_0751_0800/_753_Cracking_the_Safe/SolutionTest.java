package _0751_0800._753_Cracking_the_Safe;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertTrue;

/**
 * @author jacka
 * @version 1.0 on 1/6/2018.
 */
public class SolutionTest {
  private Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new DfsSolutionII();
  }

  @Test
  public void testOnlineCase1() throws Exception {
    final Set<String> expected = Set.of("01", "10");
    final String actual = solution.crackSafe(1, 2);
    assertTrue(expected.contains(actual));
  }

  @Test
  public void testOnlineCase2() throws Exception {
    final Set<String> expected = Set.of("00110", "01100", "10011", "11001");
    final String actual = solution.crackSafe(2, 2);
    assertTrue(expected.contains(actual));
  }

  @Test
  public void testFailedCase1() throws Exception {
    final Set<String> expected = Set.of
        ("0000100020003000400050006000700110012001300140015001600170021002200230024002500260027003100320033003400350036003700410042004300440045004600470051005200530054005500560057006100620063006400650066006700710072007300740075007600770101020103010401050106010701110112011301140115011601170121012201230124012501260127013101320133013401350136013701410142014301440145014601470151015201530154015501560157016101620163016401650166016701710172017301740175017601770202030204020502060207021102120213021402150216021702210222022302240225022602270231023202330234023502360237024102420243024402450246024702510252025302540255025602570261026202630264026502660267027102720273027402750276027703030403050306030703110312031303140315031603170321032203230324032503260327033103320333033403350336033703410342034303440345034603470351035203530354035503560357036103620363036403650366036703710372037303740375037603770404050406040704110412041304140415041604170421042204230424042504260427043104320433043404350436043704410442044304440445044604470451045204530454045504560457046104620463046404650466046704710472047304740475047604770505060507051105120513051405150516051705210522052305240525052605270531053205330534053505360537054105420543054405450546054705510552055305540555055605570561056205630564056505660567057105720573057405750576057706060706110612061306140615061606170621062206230624062506260627063106320633063406350636063706410642064306440645064606470651065206530654065506560657066106620663066406650666066706710672067306740675067606770707110712071307140715071607170721072207230724072507260727073107320733073407350736073707410742074307440745074607470751075207530754075507560757076107620763076407650766076707710772077307740775077607771111211131114111511161117112211231124112511261127113211331134113511361137114211431144114511461147115211531154115511561157116211631164116511661167117211731174117511761177121213121412151216121712221223122412251226122712321233123412351236123712421243124412451246124712521253125412551256125712621263126412651266126712721273127412751276127713131413151316131713221323132413251326132713321333133413351336133713421343134413451346134713521353135413551356135713621363136413651366136713721373137413751376137714141514161417142214231424142514261427143214331434143514361437144214431444144514461447145214531454145514561457146214631464146514661467147214731474147514761477151516151715221523152415251526152715321533153415351536153715421543154415451546154715521553155415551556155715621563156415651566156715721573157415751576157716161716221623162416251626162716321633163416351636163716421643164416451646164716521653165416551656165716621663166416651666166716721673167416751676167717172217231724172517261727173217331734173517361737174217431744174517461747175217531754175517561757176217631764176517661767177217731774177517761777222232224222522262227223322342235223622372243224422452246224722532254225522562257226322642265226622672273227422752276227723232423252326232723332334233523362337234323442345234623472353235423552356235723632364236523662367237323742375237623772424252426242724332434243524362437244324442445244624472453245424552456245724632464246524662467247324742475247624772525262527253325342535253625372543254425452546254725532554255525562557256325642565256625672573257425752576257726262726332634263526362637264326442645264626472653265426552656265726632664266526662667267326742675267626772727332734273527362737274327442745274627472753275427552756275727632764276527662767277327742775277627773333433353336333733443345334633473354335533563357336433653366336733743375337633773434353436343734443445344634473454345534563457346434653466346734743475347634773535363537354435453546354735543555355635573564356535663567357435753576357736363736443645364636473654365536563657366436653666366736743675367636773737443745374637473754375537563757376437653766376737743775377637774444544464447445544564457446544664467447544764477454546454745554556455745654566456745754576457746464746554656465746654666466746754676467747475547564757476547664767477547764777555565557556655675576557756565756665667567656775757665767577657776666766776767777000");
    final String actual = solution.crackSafe(4, 8);
    assertTrue(expected.contains(actual));
  }
}
