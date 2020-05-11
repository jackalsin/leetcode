package interviews.linkedin._946_Validate_Stack_Sequences;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jacka
 * @version 1.0 on 8/19/2019
 */
class SolutionTest {

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase1(Solution solution) {
    final int[] pushed = {1, 2, 3, 4, 5}, popped = {4, 5, 3, 2, 1};
    assertTrue(solution.validateStackSequences(pushed, popped));
  }


  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase2(Solution solution) {
    final int[] pushed = {1, 2, 3, 4, 5}, popped = {4, 3, 5, 1, 2};
    assertFalse(solution.validateStackSequences(pushed, popped));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testTLE(Solution solution) {
    final int[] pushed = {48, 70, 284, 568, 870, 142, 32, 1, 969, 170, 546, 353, 192, 730, 145, 456, 929, 160, 395,
        262, 671, 716, 826, 498, 792, 373, 943, 329, 62, 11, 548, 331, 363, 429, 558, 348, 460, 242, 788, 55, 844,
        478, 169, 273, 621, 144, 923, 591, 822, 850, 836, 115, 593, 815, 676, 304, 572, 7, 567, 867, 369, 729, 57,
        476, 22, 93, 194, 122, 31, 45, 663, 81, 594, 205, 438, 954, 660, 272, 402, 143, 20, 500, 0, 47, 237, 913, 502
        , 428, 146, 547, 413, 630, 542, 149, 422, 27, 577, 101, 686, 556, 264, 851, 673, 957, 251, 978, 234, 156, 893
        , 179, 197, 159, 166, 959, 404, 295, 489, 713, 206, 521, 736, 383, 451, 525, 227, 297, 701, 541, 589, 212,
        266, 535, 165, 774, 810, 102, 919, 333, 869, 86, 670, 800, 433, 961, 827, 222, 901, 965, 270, 733, 155, 462,
        401, 864, 922, 285, 991, 411, 814, 79, 408, 85, 650, 799, 243, 87, 523, 99, 934, 127, 283, 400, 141, 342, 543
        , 17, 235, 538, 164, 66, 452, 256, 39, 587, 573, 134, 993, 108, 794, 642, 308, 265, 334, 258, 627, 298, 695,
        175, 320, 805, 955, 446, 720, 829, 330, 103, 778, 426, 618, 771, 148, 72, 857, 238, 139, 838, 565, 15, 825,
        397, 951, 819, 479, 858, 520, 318, 6, 797, 658, 999, 652, 914, 182, 190, 250, 631, 387, 184, 545, 299, 643,
        989, 639, 528, 130, 83, 798, 765, 550, 357, 29, 158, 617, 487, 361, 339, 688, 941, 199, 990, 168, 293, 927,
        424, 504, 526, 223, 311, 257, 466, 793, 661, 26, 571, 580, 873, 379, 140, 64, 52, 36, 151, 88, 137, 105, 553,
        749, 657, 918, 848, 378, 198, 734, 289, 486, 202, 983, 392, 167, 14, 612, 120, 356, 552, 491, 349, 764, 768,
        352, 224, 881, 820, 484, 664, 244, 608, 925, 303, 427, 436, 868, 118, 416, 596, 191, 786, 905, 343, 3, 770,
        915, 569, 779, 808, 920, 84, 126, 761, 833, 780, 53, 896, 714, 94, 63, 997, 106, 823, 624, 909, 984, 409, 795
        , 176, 376, 56, 638, 964, 321, 377, 161, 902, 241, 394, 675, 317, 516, 245, 659, 230, 557, 187, 209, 46, 802,
        282, 267, 423, 425, 277, 653, 835, 501, 188, 883, 107, 351, 745, 626, 455, 4, 751, 154, 131, 606, 605, 709,
        21, 968, 767, 147, 385, 98, 940, 690, 437, 946, 171, 200, 945, 777, 90, 977, 252, 566, 217, 710, 410, 597, 9,
        763, 518, 335, 692, 372, 708, 496, 292, 41, 629, 724, 185, 417, 350, 362, 809, 651, 276, 840, 682, 49, 204,
        124, 35, 419, 875, 739, 685, 195, 693, 405, 570, 740, 440, 359, 906, 872, 852, 938, 442, 759, 705, 846, 973,
        196, 448, 307, 517, 186, 301, 620, 323, 150, 208, 581, 133, 755, 480, 625, 514, 76, 77, 789, 894, 275, 113,
        600, 274, 737, 644, 890, 509, 641, 579, 816, 302, 19, 619, 313, 950, 459, 911, 611, 992, 314, 43, 727, 766,
        748, 971, 65, 18, 216, 706, 904, 683, 667, 219, 746, 74, 924, 54, 711, 355, 882, 172, 215, 859, 853, 396, 132
        , 564, 531, 129, 628, 898, 477, 104, 813, 818, 367, 89, 78, 71, 5, 178, 80, 694, 483, 781, 960, 364, 37, 784,
        180, 985, 497, 309, 121, 811, 458, 601, 306, 646, 469, 754, 559, 666, 527, 702, 100, 801, 305, 340, 2, 931,
        912, 891, 775, 418, 817, 863, 861, 319, 123, 555, 719, 807, 782, 834, 614, 324, 715, 903, 338, 930, 956, 40,
        16, 776, 193, 665, 910, 399, 743, 970, 382, 856, 291, 678, 228, 742, 512, 837, 260, 680, 561, 406, 263, 772,
        712, 987, 721, 381, 510, 926, 804, 365, 758, 560, 135, 268, 393, 845, 82, 847, 481, 537, 723, 880, 136, 530,
        248, 255, 10, 279, 153, 886, 622, 371, 830, 95, 403, 173, 435, 347, 916, 785, 728, 294, 524, 447, 30, 578,
        430, 966, 358, 374, 421, 287, 463, 562, 473, 583, 703, 640, 885, 592, 513, 698, 407, 787, 532, 114, 854, 668,
        471, 982, 368, 895, 60, 312, 449, 613, 599, 117, 707, 534, 388, 979, 183, 42, 345, 470, 474, 632, 398, 386,
        576, 967, 806, 506, 595, 454, 549, 952, 636, 34, 962, 752, 718, 128, 634, 674, 8, 796, 937, 995, 327, 704,
        344, 900, 610, 232, 533, 203, 972, 623, 375, 125, 921, 656, 878, 574, 174, 588, 672, 540, 544, 218, 831, 366,
        25, 998, 461, 414, 505, 360, 177, 839, 226, 529, 812, 492, 790, 210, 249, 828, 607, 756, 12, 760, 236, 975,
        584, 791, 604, 986, 948, 726, 849, 420, 28, 762, 465, 602, 91, 259, 976, 247, 933, 508, 67, 332, 932, 637,
        654, 152, 865, 24, 96, 681, 189, 585, 68, 61, 119, 697, 453, 354, 326, 412, 953, 315, 963, 647, 300, 239, 522
        , 603, 842, 783, 157, 390, 370, 935, 944, 432, 254, 380, 51, 679, 645, 58, 346, 684, 633, 415, 443, 942, 336,
        439, 328, 974, 616, 988, 111, 874, 949, 485, 662, 928, 50, 841, 475, 725, 866, 876, 655, 860, 450, 472, 753,
        551, 482, 590, 493, 75, 855, 288, 732, 162, 389, 887, 316, 92, 738, 488, 884, 225, 939, 490, 947, 503, 69,
        507, 582, 457, 467, 897, 464, 240, 722, 138, 862, 325, 936, 536, 691, 163, 519, 220, 384, 515, 731, 109, 699,
        214, 290, 773, 337, 871, 769, 689, 112, 598, 73, 59, 981, 899, 615, 687, 888, 821, 648, 201, 38, 757, 253, 97
        , 669, 735, 750, 116, 229, 494, 468, 609, 246, 281, 310, 431, 445, 271, 554, 44, 892, 832, 499, 13, 824, 280,
        261, 391, 231, 696, 803, 23, 843, 233, 677, 563, 444, 296, 717, 741, 996, 207, 744, 877, 286, 495, 879, 511,
        322, 441, 110, 211, 278, 221, 994, 33, 889, 907, 747, 917, 700, 908, 980, 958, 586, 575, 434, 341, 635, 539,
        181, 649, 269, 213},
        popped = {48, 70, 284, 870, 142, 32, 568, 1, 969, 546, 170, 145, 730, 160, 395, 671, 716, 826, 262, 929, 498,
            792, 456, 192, 373, 329, 62, 943, 11, 353, 548, 331, 558, 242, 460, 348, 788, 844, 621, 923, 591, 144,
            273, 169, 822, 478, 55, 850, 815, 304, 7, 572, 676, 593, 567, 115, 836, 429, 363, 867, 369, 729, 57, 194,
            122, 31, 93, 594, 205, 81, 438, 660, 954, 663, 45, 22, 476, 402, 272, 143, 20, 0, 47, 500, 146, 547, 428,
            502, 413, 542, 149, 630, 27, 101, 686, 577, 264, 556, 422, 913, 673, 851, 237, 251, 957, 156, 893, 234,
            179, 197, 959, 166, 159, 978, 404, 489, 295, 713, 383, 736, 451, 521, 227, 297, 525, 206, 701, 541, 589,
            212, 535, 266, 810, 102, 774, 165, 869, 433, 800, 901, 965, 922, 864, 401, 462, 155, 285, 814, 411, 991,
            408, 85, 79, 733, 650, 270, 222, 827, 961, 670, 86, 333, 799, 919, 243, 523, 99, 87, 127, 934, 283, 141,
            543, 342, 17, 235, 400, 538, 164, 66, 256, 452, 587, 134, 573, 993, 794, 642, 108, 308, 258, 334, 627,
            298, 265, 39, 695, 175, 320, 955, 446, 805, 330, 829, 720, 103, 778, 618, 148, 72, 771, 426, 857, 15, 565
            , 838, 819, 858, 479, 951, 397, 825, 520, 6, 318, 139, 797, 914, 250, 631, 528, 639, 989, 643, 83, 765,
            357, 550, 158, 617, 29, 798, 130, 688, 339, 168, 293, 927, 424, 311, 223, 526, 504, 990, 793, 661, 26,
            140, 52, 64, 379, 36, 873, 580, 151, 88, 137, 571, 105, 657, 749, 918, 289, 734, 198, 202, 983, 392, 612,
            14, 356, 120, 552, 167, 491, 486, 768, 764, 881, 244, 664, 484, 820, 925, 608, 224, 352, 349, 118, 868,
            786, 3, 770, 343, 905, 920, 126, 84, 808, 779, 761, 833, 569, 915, 191, 53, 780, 997, 106, 624, 984, 909,
            823, 409, 56, 964, 638, 376, 176, 795, 63, 321, 94, 161, 241, 902, 377, 516, 317, 675, 394, 714, 245, 896
            , 659, 596, 416, 230, 209, 187, 557, 436, 427, 267, 423, 282, 802, 46, 277, 188, 351, 107, 4, 751, 455,
            626, 745, 883, 605, 606, 709, 131, 968, 21, 767, 147, 98, 690, 940, 385, 946, 200, 171, 437, 154, 501,
            777, 566, 252, 217, 710, 977, 9, 597, 692, 41, 292, 496, 629, 724, 417, 185, 362, 350, 708, 372, 335, 682
            , 35, 124, 875, 195, 570, 440, 359, 906, 872, 740, 405, 938, 852, 693, 685, 739, 419, 442, 204, 759, 49,
            705, 840, 276, 196, 448, 186, 620, 301, 517, 323, 307, 208, 150, 581, 480, 77, 789, 76, 514, 625, 894,
            275, 113, 600, 274, 641, 509, 19, 302, 816, 313, 619, 950, 579, 992, 611, 314, 43, 727, 971, 748, 766,
            911, 65, 459, 904, 706, 216, 667, 746, 219, 924, 54, 711, 74, 683, 18, 882, 859, 396, 853, 215, 132, 129,
            628, 477, 898, 531, 564, 172, 355, 890, 644, 104, 737, 818, 813, 89, 78, 71, 367, 755, 133, 973, 80, 178,
            694, 37, 784, 364, 960, 985, 497, 458, 306, 601, 646, 666, 702, 305, 340, 801, 100, 527, 559, 2, 754, 469
            , 912, 931, 811, 418, 775, 817, 861, 319, 863, 891, 121, 555, 123, 309, 782, 807, 956, 40, 776, 16, 930,
            665, 910, 399, 382, 856, 291, 678, 970, 743, 228, 193, 338, 903, 561, 680, 987, 721, 712, 772, 263, 381,
            406, 926, 804, 365, 510, 260, 758, 837, 512, 560, 742, 715, 324, 135, 614, 834, 719, 393, 845, 268, 180,
            781, 483, 5, 846, 651, 809, 518, 537, 880, 723, 530, 136, 248, 886, 95, 830, 173, 435, 347, 403, 785, 916
            , 524, 447, 294, 578, 358, 421, 287, 374, 463, 562, 966, 430, 30, 728, 371, 622, 153, 279, 473, 583, 10,
            703, 885, 640, 255, 481, 847, 82, 513, 592, 698, 787, 532, 114, 407, 471, 982, 668, 854, 763, 410, 90,
            895, 368, 60, 945, 312, 835, 449, 653, 425, 303, 613, 599, 707, 117, 183, 979, 388, 534, 378, 848, 553,
            42, 466, 470, 345, 257, 474, 806, 549, 454, 952, 595, 506, 967, 636, 576, 386, 752, 962, 34, 398, 632,
            199, 718, 941, 361, 128, 634, 674, 937, 796, 704, 900, 610, 623, 972, 203, 533, 921, 125, 375, 656, 232,
            878, 344, 174, 672, 588, 540, 218, 25, 414, 461, 505, 226, 839, 529, 492, 210, 790, 812, 249, 607, 828,
            177, 756, 360, 998, 12, 975, 584, 986, 604, 791, 236, 760, 366, 831, 948, 762, 28, 259, 933, 247, 976,
            332, 932, 654, 865, 152, 637, 67, 24, 189, 681, 96, 508, 68, 585, 91, 602, 697, 354, 326, 953, 315, 647,
            239, 300, 522, 963, 603, 412, 842, 453, 119, 157, 783, 61, 465, 432, 254, 679, 51, 346, 58, 684, 443, 415
            , 439, 336, 328, 942, 616, 111, 988, 949, 874, 974, 662, 485, 633, 475, 841, 50, 928, 866, 655, 876, 860,
            725, 645, 380, 944, 935, 551, 753, 472, 450, 75, 855, 732, 288, 316, 738, 488, 884, 92, 887, 939, 225,
            490, 947, 389, 162, 493, 590, 482, 370, 503, 69, 507, 582, 722, 240, 464, 897, 138, 936, 536, 163, 691,
            325, 862, 519, 731, 699, 214, 109, 515, 773, 337, 290, 871, 689, 769, 59, 73, 598, 112, 899, 615, 981,
            888, 201, 648, 38, 821, 669, 116, 750, 735, 229, 97, 253, 757, 494, 609, 468, 687, 310, 281, 246, 431,
            384, 220, 467, 554, 499, 13, 824, 832, 280, 261, 803, 23, 696, 231, 563, 444, 677, 233, 996, 741, 717,
            296, 207, 843, 391, 877, 286, 879, 441, 221, 278, 211, 994, 110, 33, 322, 889, 907, 747, 958, 575, 586,
            341, 635, 539, 434, 181, 649, 980, 908, 700, 213, 269, 917, 511, 495, 744, 892, 44, 271, 445, 457, 390,
            420, 849, 726, 544, 574, 327, 995, 8, 487, 299, 545, 184, 387, 190, 182, 652, 999, 658, 238};
    assertTrue(solution.validateStackSequences(pushed, popped));
  }

  static Stream<Solution> solutionStream() {
    return Stream.of(
        new SolutionI()
    );
  }
}