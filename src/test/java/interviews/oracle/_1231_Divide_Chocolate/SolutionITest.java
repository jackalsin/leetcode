package interviews.oracle._1231_Divide_Chocolate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jacka
 * @version 1.0 on 12/5/2019
 */
class SolutionITest {

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testOnlineCase1(Solution solution) {
    final int sweetness[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}, K = 5;
    assertEquals(6, solution.maximizeSweetness(sweetness, K));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testOnlineCase2(Solution solution) {
    final int sweetness[] = {5, 6, 7, 8, 9, 1, 2, 3, 4}, K = 8;
    assertEquals(1, solution.maximizeSweetness(sweetness, K));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testOnlineCase3(Solution solution) {
    final int sweetness[] = {1, 2, 2, 1, 2, 2, 1, 2, 2}, K = 2;
    assertEquals(5, solution.maximizeSweetness(sweetness, K));
//    You can divide the chocolate to[ 1, 2, 2], [1, 2, 2], [1, 2, 2]
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testOnlineCaseTLE(Solution solution) {

    final int sweetness[] = {54487, 22862, 15980, 75514, 10176, 69413, 22597, 25789, 57252, 37805, 49434, 19820, 3777
        , 54094, 76138, 29564, 93511, 48031, 97611, 52716, 46951, 43803, 18916, 66766, 92983, 5554, 10954, 3199,
        37334, 11679, 89178, 48579, 52316, 35673, 89673, 9191, 94384, 83378, 91343, 34710, 89061, 66019, 75953, 40790
        , 71051, 49461, 43560, 68874, 73860, 71709, 22642, 75495, 73388, 87581, 15061, 86377, 95583, 53806, 27653,
        29105, 18865, 32391, 81153, 87119, 19662, 6951, 13718, 83746, 13541, 45784, 26331, 76027, 51360, 21983, 93599
        , 55711, 84949, 10110, 8474, 56577, 20602, 16741, 17301, 30174, 16822, 34451, 52563, 89004, 10610, 98562,
        21857, 6498, 89579, 1537, 10484, 34412, 94360, 21153, 51608, 56486, 31480, 15069, 77450, 74020, 69348, 74157,
        246, 98644, 85684, 18597, 98341, 12142, 90073, 75423, 50391, 38441, 5001, 74094, 36337, 91347, 83835, 18462,
        78780, 9405, 25422, 20761, 18838, 72110, 24951, 15934, 66188, 23221, 80260, 19596, 31573, 48699, 80117, 3775,
        87661, 68216, 26210, 3246, 16851, 93910, 42504, 28714, 23112, 29435, 82358, 79512, 27987, 55186, 21644, 51013
        , 28814, 98969, 34116, 78916, 34302, 96545, 93102, 96551, 5209, 67276, 27899, 48175, 62210, 13612, 65848,
        38348, 80078, 9058, 2839, 59143, 7328, 37843, 97942, 39145, 71959, 36669, 63131, 78786, 2724, 47283, 62537,
        38985, 7469, 5186, 14305, 24743, 613, 92729, 47743, 26928, 51416, 82785, 21131, 86802, 54998, 40460, 97312,
        19980, 97897, 41308, 26390, 85492, 64099, 140, 52457, 73910, 3192, 31882, 54153, 69101, 41491, 63072, 44742,
        39101, 22958, 10121, 68241, 603, 24089, 2127, 88869, 60843, 18903, 81488, 29329, 63255, 3125, 59700, 8199,
        77796, 30315, 72332, 69176, 5480, 30644, 47090, 56460, 12889, 19069, 81527, 23672, 95856, 12309, 27627, 70846
        , 2716, 21460, 40699, 83856, 27254, 67604, 17978, 39954, 9498, 15441, 38604, 89200, 39335, 33751, 97060,
        54257, 61345, 19384, 83181, 55310, 77141, 999, 92018, 18165, 72412, 31894, 16809, 35213, 13397, 50622, 18818,
        85899, 6902, 26053, 58564, 34978, 71595, 45534, 92754, 79662, 36409, 44909, 24959, 33701, 58110, 43715, 44162
        , 82538, 21737, 11583, 20220, 47860, 76173, 33834, 86191, 83647, 92307, 14073, 89433, 48599, 93710, 97737,
        45006, 91410, 34339, 96061, 10485, 18755, 47980, 58174, 58891, 7167, 89592, 86330, 17845, 84853, 40621, 18992
        , 49644, 69914, 48849, 61803, 45089, 86861, 77818, 98035, 11092, 36596, 21320, 54966, 18791, 84492, 3663,
        36062, 66549, 7272, 88104, 33644, 19067, 80234, 41071, 10959, 41116, 22812, 55574, 95377, 62854, 26200, 94835
        , 20039, 37894, 76614, 35456, 82117, 23069, 18207, 28632, 79525, 55845, 142, 75341, 63642, 70244, 59274, 6752
        , 5480, 28557, 74626, 52812, 31002, 45555, 73837, 8811, 71943, 23769, 33804, 74706, 88290, 60103, 29553,
        89163, 94478, 50312, 6054, 96875, 57569, 44856, 71532, 49511, 74812, 86017, 86832, 30436, 21401, 99238, 65923
        , 8556, 18788, 13367, 84190, 52080, 83731, 77002, 75423, 73595, 21471, 45611, 61947, 63212, 13240, 44382,
        97124, 81179, 18044, 98897, 88921, 72187, 37196, 96803, 96340, 84020, 27871, 51328, 47006, 80498, 26899,
        78860, 92404, 95251, 62391, 22258, 17121, 50119, 61325, 1320, 46111, 38381, 81826, 99325, 45172, 11230, 65749
        , 43367, 71172, 79690, 30770, 20832, 20007, 65818, 20811, 17282, 2001, 15517, 1684, 60998, 85272, 93569,
        32508, 45209, 65793, 30254, 22181, 7096, 98267, 52009, 15812, 65768, 34604, 17682, 24863, 55039, 9478, 93008,
        92666, 58556, 77250, 31588, 4491, 23672, 97667, 24200, 57279, 99922, 61609, 71248, 20080, 78528, 13907, 76001
        , 29604, 36160, 74035, 1813, 45732, 24606, 75499, 48820, 65603, 57828, 62879, 34776, 99660, 60871, 37409,
        48952, 3010, 11945, 35904, 68162, 39439, 93558, 11275, 82813, 42264, 80742, 13969, 45823, 60341, 36681, 7046,
        37706, 50459, 45149, 85911, 11127, 14245, 67515, 148, 78867, 77645, 83131, 48344, 4536, 49161, 86739, 60388,
        90450, 61185, 85014, 92775,
        84490, 49783, 41, 55998, 76937, 4682, 78328, 32245, 42321, 30342, 9861, 23965, 20138, 90839, 45794, 69715,
        19143, 95068, 46628, 53498, 19783, 62328, 63967, 46514, 43738, 6980, 88177, 96853, 4805, 34869, 17028, 32418,
        19185, 96920, 93930, 91503, 74656, 51203, 93669, 26277, 35620, 41365, 17916, 13226, 86288, 95644, 95654,
        60875, 80694, 44701, 71518, 83597, 71761, 50647, 13580, 83105, 51382, 92476, 19761, 34412, 37479, 25074,
        30527, 12612, 9820, 16711, 51028, 43573, 22174, 26192, 85832, 15831, 76736, 10118, 11062, 31047, 91526, 86576
        , 38955, 97211, 79214, 57243, 82936, 85839, 17870, 88227, 9888, 52901, 87190, 89203, 45892, 74362, 6896,
        53339, 68288, 69724, 60133, 28953, 79174, 7228, 28152, 85673, 88697, 76777, 8837, 45341, 78069, 47238, 50430,
        10227, 43196, 25178, 30050, 49527, 71863, 60192, 16290, 66250, 89918, 3044, 57031, 37102, 31655, 26458, 39779
        , 6510, 643, 62492, 5765, 78016, 30519, 93448, 28183, 73454, 88197, 44562, 63298, 46612, 16475, 50626, 63252,
        60902, 34671, 69111, 90527, 21804, 32019, 1968, 20403, 94975, 10077, 31367, 19196, 50661, 76842, 76027, 15226
        , 42623, 7912, 27612, 52499, 22129, 37153, 41321, 14375, 74686, 61138, 87935, 57467, 25004, 57977, 8044,
        17543, 29254, 39153, 87249, 56335, 906, 18318, 85975, 79990, 70586, 30880, 69809, 33155, 38573, 5102, 36466,
        27491, 37819, 92885, 53942, 30848, 75935, 74167, 39037, 52529, 89852, 54889, 36739, 77303, 84425, 33829,
        90205, 61035, 18219, 57952, 93259, 4166, 95686, 47080, 8160, 77499, 35003, 13215, 27373, 41014, 31430, 58146,
        46887, 13375, 42672, 25020, 94866, 55401, 27382, 42059, 69398, 20903, 10443, 84143, 24802, 93067, 84243, 9133
        , 8864, 58476, 76340, 91892, 54985, 12794, 67705, 6439, 28196, 83939, 48061, 11647, 40342, 71397, 16322,
        10826, 31319, 83621, 59738, 10147, 79309, 47128, 36419, 94659, 73935, 40177, 35549, 90571, 7094, 85274, 20537
        , 17335, 10375, 74193, 70431, 74403, 51407, 637, 5153, 93326, 16463, 37532, 20406, 47023, 47641, 70310, 11624
        , 10990, 24226, 11498, 37367, 8829, 63501, 12557, 17432, 1457, 45598, 43, 92861, 48378, 30438, 71052, 36107,
        91763, 94120, 24116, 12568, 62176, 96118, 64954, 95555, 43020, 21706, 67920, 20082, 96004, 38929, 37700,
        53961, 9646, 84105, 32564, 37948, 5118, 78199, 22426, 31162, 75894, 23730, 89331, 20772, 11641, 46325, 26446,
        53466, 94466, 85191, 44853, 60445, 20582, 70454, 5920, 17024, 38163, 6572, 24200, 83132, 53439, 51554, 4460,
        20048, 57822, 4634, 57081, 16880, 31520, 20705, 62300, 88411, 60740, 54384, 37667, 44103, 3980, 39707, 30730,
        87550, 1214, 83014, 4772, 20421, 18414, 48214, 72987, 5470, 97290, 47283, 90869, 88891, 81111, 28275, 34990,
        39641, 81712, 44029, 68272, 76317, 95786, 87966, 9518, 48892, 45916, 3399, 50474, 76573, 11682, 43941, 34427,
        24990, 75178, 35865, 22664, 31658, 91391, 12047, 37188, 17542, 42684, 52838, 22175, 39528, 81448, 26553,
        85771, 51444, 59486, 74769, 55810, 98043, 68790, 60814, 87896, 4412, 50522, 23341, 67814, 86278, 10311, 90608
        , 24296, 56188, 63734, 98635, 25977, 51285, 6433, 29609, 89886, 9426, 86813, 2605, 6602, 909, 30522, 35069,
        16335, 23352, 7834, 16391, 82275, 987, 52932, 67967, 1933, 61664, 86861, 65161, 3643, 50291, 76894, 6188,
        43121, 6540, 50818, 79637, 32339, 63825, 20163, 79613, 18839, 43089, 72961, 85084, 96388, 69997, 59262, 23661
        , 2782, 62570, 22350, 52163, 20889, 53563, 83943, 98584, 39420, 20641, 96088, 92853, 37497, 64877, 42014,
        37726, 28878, 48648, 45140, 10621, 52651, 77622, 63856, 39127, 86950, 4944, 54679, 12291, 13588, 96847, 96703
        , 83451, 65521, 31545, 90944, 83128, 86033, 29157, 14156, 53169, 84330, 57382, 12651, 60575, 48732, 59427,
        18824, 98847, 1986, 6125, 22828, 64608, 78630, 72284, 39096, 525, 26633, 36775, 54036, 57116, 65576, 12635,
        50804, 81706, 64694, 85252, 73438, 15149, 28013, 65629, 44896, 20200, 99251, 2558, 60323, 66511, 22350, 58574
        , 37240, 18426, 45582, 16443, 99006, 89896, 40482, 83296, 30896, 90283, 36326, 596, 25842, 37669, 51535,
        83485, 78723, 67072, 86184, 47473, 28765, 10604, 699, 22834, 31515, 50468, 47045, 30955, 19359, 60373, 43339,
        8775, 42162, 49799, 46594, 53276, 65668, 84800, 14276, 70989, 81433, 59698, 9850, 69400, 94853, 83942, 25382,
        70601, 66810, 10550, 72722, 59249, 72541, 25180, 84741, 93422, 77206, 49834, 72572, 16318, 72419, 25475,
        80823, 40447, 54966, 36590, 37596, 47506, 33101, 67718, 67495, 50790, 89832, 53560, 67243, 55693, 11158,
        60073, 48469, 13977, 23615, 36245, 19994, 84077, 83254, 71330, 52581, 26599, 24389, 45813, 16779, 61520,
        61232, 37072, 79649, 61288, 63434, 96900, 46789, 49272, 21157, 70873, 45153, 68250, 94531, 51574, 42359,
        25427, 33327, 62051, 83614, 28245, 24719, 31479, 3692, 92089, 31593, 62864, 18181, 56588, 11043, 37604, 36701
        , 44335, 60815, 44633, 29960, 73147, 11908, 79121, 91538, 63968, 69247, 51080, 70011, 55394, 51672, 54238,
        80305, 49155, 537, 47874, 96589, 94298, 72249, 79763, 86966, 31674, 51511, 54043, 19245, 92583, 58587, 37906,
        58507, 86395, 99412, 57775, 75327, 19374, 99488, 64959, 75885, 90253, 97690, 90318, 78041, 93998, 40634,
        49140, 97028, 13021, 18473, 538, 15827, 35722, 77993, 49757, 52461, 42783, 84280, 30981, 66789, 22766, 98999,
        10055, 63269, 30745, 97873, 12879, 42858, 8691, 40171, 4647, 87983, 99497, 52370, 29794, 66303, 90278, 10175,
        74950, 64675, 92918, 87572, 81601, 74732, 87452, 52969, 75584, 34917, 16508, 30758, 34219, 17438, 95363,
        13468, 68547, 64478, 94092, 69311, 35801, 50133, 68730, 21118, 26918, 43898, 11533, 20938, 6255, 6560, 7484,
        82048, 47475, 27768, 82435, 65974, 1005, 70379, 18498, 83435, 59008, 87553, 59127, 11909, 49685, 23041, 52882
        , 88035, 14473, 16562, 70309, 62514, 59178, 87464, 5276, 4016, 22377, 83011, 55971, 56349, 41099, 1543, 57611
        , 74700, 20377, 95120, 16383, 62665, 87250, 72846, 74797, 70515, 69815, 29220, 70905, 78638, 61108, 19119,
        16251, 37848, 60917, 3257, 15856, 53894, 97676, 92829, 64244, 30874, 40064, 80285, 27893, 73058, 38459, 98252
        , 93393, 52057, 43762, 40929, 79261, 30729, 66971, 87571, 46186, 93836, 55453, 40370, 49374, 75833, 29612,
        57720, 86914, 26253, 25672, 33112, 25127, 46278, 49051, 50609, 77949, 27309, 42099, 81419, 35285, 47976,
        68447, 84420, 33484, 68012, 10179, 80523, 17395, 8960, 83086, 85316, 31996, 58021, 45758, 17856, 65588, 53154
        , 82130, 55404, 67473, 5041, 67763, 32607, 15799, 86104, 98885, 88720, 4977, 36935, 89052, 92255, 67554,
        54113, 51787, 8574, 28249, 48083, 56101, 75353, 88184, 98360, 61948, 60059, 30447, 21789, 3383, 86968, 91854,
        44212, 44349, 67532, 34677, 38273, 38747, 48480, 20917, 29514, 79750, 92400, 73508, 96263, 79777, 57795,
        10108, 16813, 16772, 68706, 91484, 49296, 96971, 9677, 90382, 82299, 13250, 23313, 87647, 3361, 51578, 11979,
        36111, 2687, 95333, 3392, 33779, 92983, 69966, 32064, 8544, 59642, 50637, 54711, 56968, 75303, 56323, 7671,
        84253, 88737, 74200, 60127, 42753, 55078, 68483, 64809, 68118, 82307, 28408, 16848, 29059, 44151, 41036,
        95063, 56698, 18950, 98094, 34396, 8836, 24388, 41453, 53189, 42281, 81633, 41034, 59712, 94184, 7628, 24785,
        97126, 38181, 67034, 54482, 37255, 59293, 28299, 96433, 23517, 54932, 98302, 393, 38863, 79850, 76941, 53660,
        5291, 85090, 18469, 98406, 62912, 96964, 926, 62035, 8448, 62480, 36938, 5557, 59481, 3047, 17634, 3749,
        83186, 22938, 71749, 66036, 70586, 84236, 78712, 75006, 53522, 90680, 26811, 97224, 55418, 41399, 45050,
        28862, 1304, 66437, 49986, 70791, 42421, 61439, 78779, 75219, 80455, 88913, 30011, 61460, 92148, 24951, 18161
        , 18240, 93755, 36952, 44320, 79854, 85934, 26084, 57983, 61043, 21135, 5386, 32179, 17485, 31408, 25068,
        66758, 20577, 91516, 18625, 3794, 71827, 69781, 30284, 63788, 73465, 8406, 46524, 54193, 76296, 62493, 38130,
        23332, 73000, 85269, 91310, 97372, 33992, 49180, 69611, 37814, 99087, 46592, 28416, 18678, 43536, 28964, 5047
        , 65533, 27906, 17114, 57015, 99707, 25294, 85396, 26384, 73400, 78571, 49496, 19653, 27542, 60307, 65261,
        10349, 98006, 38683, 32092, 50313, 81493, 35482, 4318, 11798, 20957, 92567, 85054, 45805, 33016, 49988, 37466
        , 19187, 65012, 6574, 70980, 73911, 95031, 40917, 47311, 20011, 32982, 72201, 88590, 37022, 70230, 7522,
        90320, 87243, 10963, 54006, 81200, 86454, 69611, 47192, 61035, 978, 90078, 3505, 9402, 95600, 84224, 52403,
        29301, 95922, 20315, 88840, 49885, 48163, 36669, 88472, 72794, 41592, 26332, 86981, 974, 26049, 61408, 39821,
        26279, 82352, 26712, 81410, 26321, 73734, 34374, 55313, 42115, 83676, 26, 47856, 42979, 23661, 85213, 62437,
        31723, 69108, 3978, 29168, 18502, 44189, 84595, 96204, 82450, 43673, 29170, 90135, 22695, 23586, 42099, 9405,
        87798, 3263, 66160, 8054, 43663, 35623, 43652, 64162, 38814, 32016, 13582, 74898, 96768, 37602, 16974, 92181,
        13685, 22392, 87903, 68710, 6205, 39619, 21932, 7066, 39076, 24774, 22790, 5627, 41131, 88212, 88023, 48450,
        36156, 819, 70972, 77313, 74916, 19901, 20652, 39629, 23418, 96309, 10438, 14565, 10824, 69595, 12239, 12858,
        8015, 65231, 17563, 13796, 87352, 64291, 73868, 73487, 38422, 68469, 14803, 13579, 92268, 15960, 51836, 51362
        , 86804, 34311, 36623, 48828, 86719, 44568, 28399, 5629, 7036, 44760, 26640, 72436, 58368, 93392, 16961,
        51307, 97763, 54924, 79011, 7673, 67581, 68767, 30771, 95417, 37594, 26636, 18750, 57975, 81257, 933, 69574,
        77260, 22473, 99708, 69330, 65056, 5127, 81708, 36806, 2351, 86724, 9194, 58959, 1604, 55618, 47774, 56359,
        23826, 82616, 27325, 81001, 11648, 65687, 94838, 80356, 32084, 61839, 16069, 14566, 22039, 27416, 95897,
        49350, 78681, 41546, 53863, 16474, 4774, 74713, 53722, 76600, 89835, 36307, 96955, 57125, 35196, 76096, 92734
        , 15980, 14651, 80056, 18710, 51765, 64095, 46280, 63455, 88360, 97270, 85456, 86047, 45116, 5317, 53632,
        73653, 61263, 43772, 70067, 1914, 45491, 80531, 65522, 73191, 58857, 32183, 67491, 77485, 5226, 58407, 97590,
        57381, 39207, 51747, 91948, 13673, 12800, 34317, 47797, 44229, 10841, 19579, 58866, 62949, 34050, 46401,
        21636, 40950, 60082, 11407, 2816, 23781, 79271, 77173, 59866, 61006, 8875, 37666, 23395, 17929, 18025, 13934,
        44926, 12368, 59512, 67868, 83946, 20686, 14514, 73946, 39248, 2351, 74293, 21976, 63220, 98575, 53743, 77067
        , 96662, 69908, 75979, 16914, 74621, 13021, 49544, 24681, 47813, 68111, 8803, 12491, 87279, 43430, 18296,
        46728, 85978, 24526, 73919, 44242, 5161, 29679, 44245, 86977, 6723, 24565, 94274, 78912, 94757, 29207, 40076,
        75721, 97250, 94708, 5237, 4759, 46292, 90986, 55934, 12465, 47941, 38889, 49334, 6130, 54641, 25450, 88231,
        90860, 72242, 15296, 61029, 28178, 74860, 23703, 11333, 27336, 64749, 24256, 85770, 79335, 61487, 80593,
        39931, 65501, 61660, 60778, 87684, 75749, 35510, 13089, 43603, 68012, 57966, 6900, 52154, 84109, 17843, 70449
        , 36368, 28313, 99142, 36214, 52550, 83551, 16943, 26865, 98890, 98826, 54090, 68411, 23563, 89085, 69491,
        45685, 3636, 90133, 13380, 45243, 54624, 93399, 91604, 81803, 23055, 88474, 73327, 30169, 17874, 97885, 5694,
        77561, 93802, 25647, 65315, 67245, 88491, 86310, 597, 29909, 51756, 66980, 19611, 38347, 45907, 84437, 37203,
        45218, 30853, 42305, 93704, 67765, 10258, 10913, 34257, 52096, 90613, 86877, 71650, 30227, 2863, 25269, 26184
        , 83423, 45380, 45434, 83542, 14838, 2448, 29741, 11333, 99231, 7450, 48565, 74584, 79333, 67699, 65462,
        19855, 26090, 74403, 96284, 31408, 7756, 87102, 67033, 96520, 67881, 66722, 83840, 49308, 50758, 72243, 45953
        , 15970, 50341, 66084, 34134, 74224, 98367, 67158, 51673, 97824, 53155, 62224, 91992, 55379, 35482, 60591,
        24982, 57154, 12650, 48046, 93288, 78254, 82708, 82090, 75625, 91639, 49012, 2897, 16762, 88561, 18362, 38306
        , 10875, 31554, 15699, 19626, 85612, 25243, 79199, 69745, 72646, 12726, 44081, 19916, 38295, 57183, 27696,
        43676, 42057, 63234, 56098, 64342, 46769, 98189, 77341, 4430, 40552, 55238, 30852, 88215, 83583, 44509, 90590
        , 1871, 61110, 10872, 89299, 44669, 77289, 73558, 72959, 8419, 6532, 17769, 83712, 475, 92629, 79117, 62626,
        93338, 82874, 95932, 86650, 92564, 25936, 43804, 56281, 19875, 9935, 38913, 93944, 40601, 96541, 80084, 83477
        , 14954, 13171, 41465, 88928, 18600, 24964, 2839, 71648, 73314, 64383, 55988, 5013, 1297, 6203, 42138, 77666,
        65152, 84413, 1447, 63540, 82999, 68650, 290, 24364, 18701, 51356, 57979, 20549, 13134, 81777, 81113, 55764,
        63066, 42365, 64016, 43652, 19312, 30912, 35935, 84149, 90907, 4505, 69004, 91048, 5383, 40451, 25930, 82572,
        73349, 77968, 21389, 82043, 42639, 62709, 63573, 32067, 30690, 85032, 35566, 61938, 42989, 53163, 53785,
        10396, 75347, 98095, 92051, 84081, 55999, 28315, 15272, 2330, 17874, 53034, 86877, 43669, 43462, 43683, 66560
        , 88841, 87307, 18576, 69471, 77427, 83429, 45154, 40264, 6131, 79695, 76381, 89188, 27884, 17341, 44430,
        23886, 3951, 46032, 91794, 3679, 43803, 29678, 6385, 32275, 89765, 13419, 94054, 6969, 15335, 21729, 73099,
        86990, 68015, 62431, 22347, 71123, 99485, 49756, 68485, 32460, 63944, 7363, 64382, 59552, 91463, 75492, 54179
        , 21609, 8362, 79177, 13988, 44157, 68020, 64545, 4812, 72443, 8770, 21590, 26304, 22303, 30320, 36903, 26036
        , 28596, 76861, 17141, 56977, 30536, 32538, 26005, 22719, 50169, 95624, 30962, 74152, 71017, 52048, 41406,
        69607, 99161, 92242, 40973, 15784, 34236, 10396, 94259, 57917, 50937, 36216, 93552, 67053, 4976, 22106, 53831
        , 99852, 16562, 2168, 74190, 40156, 25124, 76702, 65108, 59693, 16060, 97473, 72149, 27320, 71789, 1816,
        76723, 80593, 57939, 49477, 30060, 88509, 59946, 2390, 73660, 54331, 62256, 6400, 75268, 76065, 43686, 9221,
        23476, 81563, 13018, 99249, 3862, 83867, 28084, 87248, 79446, 33180, 26492, 55635, 71577, 18457, 36034, 26243
        , 68915, 8926, 6847, 60598, 83172, 4118, 25581, 44572, 20350, 70815, 98030, 54822, 18894, 61433, 43097, 24667
        , 7942, 44741, 88409, 52768, 14817, 95499, 1419, 78746, 72509, 59093, 5741, 21792, 90134, 62337, 51346, 26838
        , 15027, 14392, 19311, 40119, 91729, 46394, 91419, 5755, 44340, 69247, 64752, 48612, 8840, 3355, 29070, 19007
        , 31267, 87803, 45039, 31230, 38881, 11572, 59042, 6823, 2860, 11103, 54930, 14190, 63177, 3825, 20252, 89299
        , 75444, 18718, 39394, 76553, 41853, 79244, 85428, 7295, 39427, 69123, 39729, 73899, 65929, 41004, 31752,
        24771, 29727, 51179, 50502, 64832, 71451, 21877, 78427, 42273, 99489, 77310, 87243, 4775, 53942, 51857, 836,
        47052, 90623, 48187, 46010, 50595, 22028, 54804, 94308, 15520, 40557, 86450, 80246, 463, 71435, 38701, 86122,
        20671, 28869, 95495, 86722, 15396, 70679, 69978, 51635, 30548, 92141, 81512, 45895, 63000, 32782, 4787, 20170
        , 17725, 54857, 99564, 88146, 79705, 16612, 17959, 71538, 13945, 15162, 21576, 87018, 8606, 91515, 57548,
        1974, 11243, 47191, 72572, 88497, 3195, 79111, 55058, 93044, 86305, 60222, 36872, 44257, 4257, 75378, 5292,
        46068, 94465, 6724, 46771, 75973, 48000, 84085, 84288, 11891, 22797, 46668, 87965, 29197, 85547, 15630, 90002
        , 35561, 82048, 7338, 36157, 19897, 68095, 84409, 90297, 16584, 8473, 13735, 99152, 12392, 26371, 25292,
        78491, 69829, 30784, 59268, 90891, 13721, 73856, 83176, 16527, 45035, 45741, 81937, 95275, 91655, 7496, 75443
        , 29376, 69345, 51533, 73949, 57839, 83448, 63247, 79166, 63429, 35223, 30466, 93304, 96036, 99130, 93837,
        50958, 29144, 81649, 32978, 34052, 83879, 97649, 36481, 78550, 83646, 50551, 56136, 88445, 22252, 96809,
        50374, 98697, 3756, 5512, 32695, 40056, 36994, 32262, 67470, 51310, 87977, 64240, 36885, 63926, 57706, 59978,
        3847, 38555, 65852, 40361, 20676, 4712, 50773, 70361, 98818, 22208, 82688, 52835, 93653, 37288, 34139, 96969,
        338, 18008, 87728, 12697, 94398, 2227, 39206, 16895, 53842, 14852, 31603, 71917, 85217, 61255, 99814, 70409,
        4878, 76534, 35310, 87441, 64243, 75451, 65028, 592, 62539, 7270, 87472, 76869, 43423, 63418, 119, 40210,
        27332, 67846, 5665, 22019, 38624, 1166, 13946, 62687, 72571, 83002, 33797, 95243, 8357, 15251, 46589, 97698,
        39635, 29635, 24707, 45611, 52711, 69050, 17021, 29400, 46593, 19593, 89046, 18634, 85081, 98749, 42158,
        72470, 98178, 12924, 59386, 69573, 77790, 2131, 3016, 95315, 96385, 84630, 84636, 25217, 93642, 48624, 90018,
        78334, 23353, 52946, 93354, 94596, 84683, 85648, 14562, 23770, 60295, 40526, 35519, 24791, 20595, 85258,
        36242, 6031, 63909, 24973, 26836, 44002, 59955, 91751, 6338, 22664, 79429, 54140, 44717, 6949, 43121, 92315,
        32273, 30284, 77688, 47185, 55543, 8154, 81077, 22408, 36401, 19400, 39767, 79933, 85402, 68330, 80012, 53475
        , 41567, 73763, 65113, 78651, 2161, 29592, 71854, 56223, 17694, 11118, 12431, 70406, 94099, 78524, 29174,
        84868, 16240, 51, 5846, 48105, 85826, 295, 61012, 54359, 8414, 82060, 89486, 87345, 27253, 61859, 39087,
        93192, 22619, 48102, 72778, 38513, 85712, 98439, 79420, 52224, 27782, 5213, 55320, 55742, 79741, 93109, 48828
        , 57860, 31113, 60103, 29370, 7721, 61803, 66284, 33239, 85399, 47178, 51991, 69240, 31243, 82826, 47644,
        63660, 95035, 18977, 11125, 3650, 81241, 73028, 72789, 13482, 84208, 76455, 90523, 81047, 72106, 95648, 30413
        , 79208, 927, 84835, 72717, 94795, 57931, 7200, 23283, 59537, 31275, 77757, 98122, 28491, 91838, 13329, 80408
        , 95103, 13766, 7100, 44657, 48147, 45243, 21818, 19674, 7447, 9322, 31812, 45103, 63702, 86365, 32413, 85227
        , 61261, 65186, 38182, 42570, 11890, 72622, 1439, 41035, 95441, 46912, 54699, 24386, 54281, 60025, 19922,
        74228, 70975, 85336, 37530, 30347, 25706, 29308, 57420, 72969, 80494, 50178, 54476, 20651, 60025, 93868,
        62530, 55663, 80343, 51952, 34985, 29116, 56326, 74349, 75052, 82795, 72267, 66400, 65324, 57074, 16274,
        28017, 11024, 8740, 50952, 75431, 77928, 8107, 92644, 43156, 95038, 30581, 34230, 43538, 74548, 66492, 8735,
        85931, 9510, 53563, 39582, 13655, 33275, 9192, 57504, 39664, 36138, 72077, 74499, 20217, 60870, 10228, 67527,
        87524, 43374, 59956, 22873, 84709, 49292, 79062, 62824, 54211, 67697, 68081, 82588, 48361, 65820, 65471,
        63685, 50414, 69249, 13216, 27661, 8335, 20505, 11846, 79077, 13126, 64284, 96263, 14661, 22480, 3629, 27633,
        31201, 34190, 7080, 40075, 74287, 58339, 62879, 22386, 56280, 29789, 24928, 89098, 98777, 96430, 72336, 91595
        , 9296, 18280, 47952, 31010, 90816, 14224, 80855, 71174, 12198, 32998, 6048, 23579, 64060, 96474, 21615,
        36234, 14013, 3238, 92373, 75664, 33979, 95571, 7853, 22276, 55427, 94256, 48101, 71631, 92863, 66599, 71604,
        89718, 26504, 29412, 55954, 92126, 50605, 37387, 5965, 58703, 50525, 31350, 39076, 59648, 87652, 61293, 27165
        , 36708, 44183, 64308, 85424, 28158, 52506, 39159, 88435, 37630, 84363, 3780, 35174, 92438, 92672, 79466,
        17291, 96060, 4577, 71622, 22115, 42239, 98633, 89854, 1917, 54861, 50187, 67, 35388, 23878, 98462, 26532,
        33688, 59858, 94363, 94836, 18052, 68408, 33605, 98054, 67573, 96024, 10008, 13691, 49035, 22802, 12101,
        53375, 62983, 57686, 31912, 63722, 68683, 9210, 27246, 46276, 45630, 3601, 85956, 60867, 87466, 98640, 83181,
        39444, 63928, 90595, 47327, 46327, 58612, 38959, 65669, 56709, 40479, 48366, 47297, 98586, 66002, 48274,
        55385, 26096, 5438, 40446, 89644, 52948, 84364, 41814, 14289, 32049, 34814, 54515, 99023, 38295, 72672, 29025
        , 27143, 80708, 39087, 87860, 82354, 95784, 78813, 19172, 74893, 94520, 4315, 42783, 93802, 32558, 9976,
        73316, 78734, 34993, 85794, 79278, 91737, 93180, 45728, 8628, 35329, 81196, 58388, 65813, 81913, 76944, 57086
        , 6586, 40757, 16968, 74821, 58091, 96041, 6316, 11624, 8134, 20172, 48389, 91911, 67959, 19830, 11981, 11768
        , 88751, 50003, 83192, 56829, 1615, 52009, 94639, 83246, 3408, 15601, 69779, 79935, 89864, 37051, 60261,
        81960, 94007, 87588, 30377, 78965, 69929, 845, 25094, 19886, 92899, 6892, 38482, 31182, 85771, 36118, 36599,
        42289, 25999, 48043, 43158, 19867, 13501, 83463, 33203, 61798, 20831, 58452, 17244, 10636, 96765, 81810,
        62465, 6942, 70733, 98515, 62051, 11814, 63835, 9846, 73258, 57611, 99074, 28238, 54363, 51010, 7079, 22764,
        667, 18102, 58742, 24800, 36490, 26240, 14776, 33927, 1038, 90178, 21889, 8217, 54306, 38323, 16888, 23210,
        12753, 6569, 57027, 68522, 3219, 26924, 3025, 24929, 15384, 66461, 12200, 13342, 82215, 2919, 63677, 33858,
        21121, 15988, 55911, 479, 24506, 41081, 48076, 61964, 82802, 16108, 94277, 7114, 50282, 42059, 93540, 29660,
        35051, 36205, 15316, 91001, 12736, 2207, 43615, 77372, 97052, 90467, 54198, 68674, 47551, 26023, 39557, 34340
        , 95084, 7905, 8843, 54145, 69622, 43310, 85964, 9450, 96518, 8431, 5628, 68559, 75377, 8905, 25457, 41236,
        48398, 80518, 88319, 43466, 92473, 41408, 51781, 67868, 87329, 99075, 65787, 42501, 89505, 42368, 98100,
        24832, 80598, 85288, 47182, 10484, 26047, 70092, 8279, 1657, 89815, 42095, 12819, 41781, 18423, 46855, 1120,
        3908, 63724, 16175, 16574, 66831, 10113, 19128, 50121, 91674, 55236, 67510, 400, 68775, 20137, 4648, 78606,
        44069, 33963, 58144, 61055, 73317, 67325, 32797, 93771, 59185, 33793, 95183, 70428, 81769, 63409, 52515,
        61478, 50146, 42778, 10003, 24291, 27736, 61483, 64646, 11553, 77786, 71564, 5541, 3976, 86179, 93019, 18642,
        52210, 74713, 23767, 59328, 38446, 55599, 62789, 33218, 45385, 80511, 42503, 34260, 89578, 35438, 84011,
        49720, 97562, 40815, 86348, 87462, 12371, 23747, 68573, 81007, 97129, 54762, 11490, 84085, 16008, 39019,
        89262, 40224, 58673, 82888, 29806, 10039, 84278, 41222, 20187, 57696, 65571, 61943, 49857, 63288, 59541,
        89983, 59717, 15454, 69666, 36195, 27492, 79333, 69408, 69248, 82872, 79028, 84540, 88496, 69299, 11261,
        74430, 91474, 39450, 86738, 59453, 87863, 68060, 99819, 45852, 30294, 97921, 54917, 25548, 84505, 15761,
        58167, 17109, 80933, 68004, 33271, 89038, 65528, 3131, 41112, 84411, 98884, 75052, 67750, 53815, 72903, 22285
        , 15641, 1738, 92317, 51325, 52980, 83949, 21770, 49193, 63109, 54757, 39052, 90905, 31921, 63405, 82761,
        83271, 62023, 97531, 75810, 65875, 99236, 61578, 8208, 20785, 24626, 72508, 19390, 26605, 90184, 85612, 82081
        , 91930, 5568, 813, 32824, 29048, 95279, 80979, 14693, 6825, 94726, 67521, 62515, 3861, 7923, 42548, 96165,
        96773, 95575, 5423, 17439, 96116, 59676, 40720, 17214, 45819, 96633, 18934, 18594, 23878, 76525, 61690, 29602
        , 85118, 79850, 94732, 34473, 95430, 97014, 78809, 93562, 91981, 82185, 14145, 95538, 49653, 74858, 17044,
        36271, 17357, 77293, 30423, 39289, 68393, 68497, 37766, 887, 39225, 69301, 4675, 70793, 22177, 32978, 43756,
        91496, 15477, 2478, 81292, 6276, 47783, 17614, 55769, 55650, 81775, 64728, 33574, 52060, 24613, 82703, 76216,
        37231, 83305, 7483, 96379, 17876, 14333, 25762, 79041, 58642, 66484, 87813, 85485, 58936, 21637, 56544, 45588
        , 64641, 15718, 95833, 10744, 89943, 81890, 10585, 85129, 16613, 50887, 97600, 46333, 23458, 86027, 97051,
        82394, 74183, 46607, 88180, 48104, 3182, 41064, 58924, 40952, 38012, 76782, 5294, 58403, 68802, 68695, 29319,
        27168, 33024, 53165, 69881, 87793, 4661, 74172, 88405, 5554, 48684, 39709, 87998, 17611, 51237, 78661, 50099,
        5546, 22613, 58821, 96803, 69477, 54975, 89046, 33939, 65122, 66989, 34783, 18371, 89102, 13956, 41648, 3395,
        47314, 63307, 43664, 92519, 69082, 5352, 66127, 78420, 16931, 61639, 68179, 49477, 68722, 97570, 14341, 26425
        , 82657, 69249, 76588, 55944, 98809, 64708, 98094, 68996, 40800, 13822, 2853, 32473, 153, 74793, 23173, 17446
        , 94686, 55429, 81870, 89484, 91155, 7989, 40454, 77783, 18492, 13995, 48478, 10796, 81109, 40395, 81893,
        54100, 78167, 42268, 99801, 24229, 70776, 86867, 91017, 96352, 70227, 42985, 92326, 8481, 42796, 61174, 22824
        , 27342, 76761, 65710, 24930, 26914, 57990, 81727, 55414, 39593, 21715, 67257, 79302, 15369, 5560, 83406,
        13145, 33359, 23631, 55237, 70737, 72372, 74604, 15264, 44955, 97552, 55765, 49470, 74596, 30565, 68057,
        19009, 70859, 98724, 12559, 88551, 53510, 19122, 85595, 12274, 54230, 60890, 52804, 60095, 24191, 77197,
        45151, 44508, 47521, 5819, 32185, 39845, 12697, 53966, 48568, 73593, 30416, 18833, 76338, 52701, 99844, 28614
        , 32681, 24547, 54365, 87911, 99917, 93915, 80462, 67826, 6416, 74942, 19607, 29722, 44367, 81903, 16301,
        62685, 82649, 51421, 40028, 22238, 85327, 81717, 76086, 64069, 6430, 60437, 58980, 57048, 36498, 47382, 25567
        , 11033, 51255, 645, 50395, 4551, 66319, 88820, 660, 54271, 35786, 1494, 75141, 94814, 75685, 38339, 88414,
        40403, 9667, 55809, 1632, 62914, 90664, 94787, 54767, 82540, 23577, 90751, 99573, 28010, 37170, 33023, 61513,
        57254, 98138, 41123, 44239, 61101, 93184, 4268, 46104, 2739, 49011, 25930, 69096, 76249, 55706, 1889, 50451,
        89575, 12620, 51586, 91852, 88386, 94064, 21096, 9261}, K = 2128;
    assertEquals(63967, solution.maximizeSweetness(sweetness, K));
//    You can divide the chocolate to[ 1, 2, 2], [1, 2, 2], [1, 2, 2]
  }


  static Stream<Solution> solutionProvider() {
    return Stream.of(
        new SolutionI()
    );
  }
}